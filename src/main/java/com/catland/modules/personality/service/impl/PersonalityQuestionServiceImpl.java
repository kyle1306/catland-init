package com.catland.modules.personality.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.catland.common.api.ResultCode;
import com.catland.common.enums.PersonalityDimensionEnum;
import com.catland.common.enums.PersonalityIndexEnum;
import com.catland.common.enums.PersonalityTypeEnum;
import com.catland.common.exception.ApiException;
import com.catland.common.utils.GsonUtil;
import com.catland.domain.AdminUserDetails;
import com.catland.modules.personality.dto.PerAnswerRequest;
import com.catland.modules.personality.dto.PerQuestionDTO;
import com.catland.modules.personality.dto.PersonalityResultDTO;
import com.catland.modules.personality.model.PersonalityQuestion;
import com.catland.modules.personality.mapper.PersonalityQuestionMapper;
import com.catland.modules.personality.service.PersonalityQuestionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.catland.modules.ums.model.UmsAdmin;
import com.catland.modules.ums.service.UmsAdminService;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * <p>
 * 性格测试题库 服务实现类
 * </p>
 *
 * @author macro
 * @since 2023-08-19
 */
@Service
@Slf4j
public class PersonalityQuestionServiceImpl extends ServiceImpl<PersonalityQuestionMapper, PersonalityQuestion> implements PersonalityQuestionService {
    @Resource
    private UmsAdminService adminService;

    @Override
    public List<PerQuestionDTO> selectQuestionList() {
        List<PerQuestionDTO> questionDTOList = Lists.newArrayList();
        List<Integer> dimensionList = PersonalityDimensionEnum.getDimensionList();
        for (Integer dimension : dimensionList) {
            QueryWrapper<PersonalityQuestion> wrapper = new QueryWrapper<>();
            wrapper.lambda().eq(PersonalityQuestion::getQuestionType, dimension);
            List<PersonalityQuestion> questionList = list(wrapper);
            // 一种类型问题随机选出一个问题
            if (CollectionUtils.isNotEmpty(questionList)) {
                int index = RandomUtils.nextInt(0, questionList.size());
                PersonalityQuestion personalityQuestion = questionList.get(index);
                PerQuestionDTO perQuestionDTO = new PerQuestionDTO();
                BeanUtils.copyProperties(personalityQuestion, perQuestionDTO);
                questionDTOList.add(perQuestionDTO);
            }
        }
        return questionDTOList;
    }

    @Override
    public PersonalityResultDTO queryPersonality(List<PerAnswerRequest> requestList) {
        log.info("queryPersonality requestList {}", GsonUtil.toJson(requestList));
        char[] personalityChar = new char[requestList.size()];
        Map<Integer, PerAnswerRequest> typeAnswerMap = Maps.uniqueIndex(requestList, PerAnswerRequest::getType);
        List<Integer> dimensionList = PersonalityDimensionEnum.getDimensionList();
        for (int i = 0; i < dimensionList.size(); i++) {
            PerAnswerRequest perAnswerRequest = typeAnswerMap.get(dimensionList.get(i));
            PersonalityIndexEnum personalityIndex = PersonalityIndexEnum.getPersonalityIndex(perAnswerRequest.getAnswer());
            personalityChar[i] = personalityIndex.getAbbreviation();
        }
        String personalityCode = String.valueOf(personalityChar);
        PersonalityTypeEnum personality = PersonalityTypeEnum.getPersonalityByCode(personalityCode);
        if (Objects.isNull(personality)) {
            log.error("queryPersonality error.personality result is null,personalityCode {}", personalityCode);
            throw new ApiException("无法匹配到已知人格");
        }
        // 增加用户信息上下文
        AdminUserDetails adminUser = (AdminUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (Objects.isNull(adminUser)) {
            log.error("queryPersonality error. cannot find login user");
            throw new ApiException("无法获取登录用户信息");
        }

        UmsAdmin umsAdmin = adminUser.getUmsAdmin();
        umsAdmin.setPersonalityCode(personality.getCode());
        adminService.update(umsAdmin.getId(), umsAdmin);
        return PersonalityResultDTO.convertDTO(personality);
    }
}
