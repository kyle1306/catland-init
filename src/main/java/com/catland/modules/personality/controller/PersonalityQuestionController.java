package com.catland.modules.personality.controller;


import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.catland.common.api.CommonResult;
import com.catland.modules.personality.dto.PerAnswerRequest;
import com.catland.modules.personality.dto.PerQuestionDTO;
import com.catland.modules.personality.dto.PersonalityResultDTO;
import com.catland.modules.personality.model.PersonalityQuestion;
import com.catland.modules.personality.service.PersonalityQuestionService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 性格测试题库 前端控制器
 * </p>
 *
 * @author macro
 * @since 2023-08-19
 */
@RestController
@RequestMapping("/personality/personalityQuestion")
public class PersonalityQuestionController {
    @Resource
    private PersonalityQuestionService questionService;

    /**
     * 页面判断用户无人格结果信息后，调用题库接口返回题库内容
     */
    @ApiOperation(value = "返回性格测试题库问题列表")
    @PostMapping("get")
    @ResponseBody
    public CommonResult<List<PerQuestionDTO>> personalityQuestion() {
        List<PerQuestionDTO> questionList = questionService.selectQuestionList();
        return CommonResult.success(questionList);
    }

    // TODO: 2023/9/2 通过测试结果，更新用户性格，同时返回性格结果
    @ApiOperation(value = "根据答题结果返回性格结果")
    @PostMapping("result")
    @ResponseBody
    public CommonResult<PersonalityResultDTO> personalityResult(@RequestBody List<PerAnswerRequest> requestList) {
        if (CollectionUtils.isEmpty(requestList)) {
            return CommonResult.validateFailed("答题结果为空");
        }
        PersonalityResultDTO dto = questionService.queryPersonality(requestList);
        return CommonResult.success(dto);
    }
}

