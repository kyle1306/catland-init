package com.catland.modules.personality.service;

import com.catland.modules.personality.dto.PerAnswerRequest;
import com.catland.modules.personality.dto.PerQuestionDTO;
import com.catland.modules.personality.dto.PersonalityResultDTO;
import com.catland.modules.personality.model.PersonalityQuestion;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 性格测试题库 服务类
 * </p>
 *
 * @author macro
 * @since 2023-08-19
 */
public interface PersonalityQuestionService extends IService<PersonalityQuestion> {

    List<PerQuestionDTO> selectQuestionList();

    PersonalityResultDTO queryPersonality(List<PerAnswerRequest> requestList);
}
