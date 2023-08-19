package com.catland.modules.personality.service.impl;

import com.catland.modules.personality.model.PersonalityQuestion;
import com.catland.modules.personality.mapper.PersonalityQuestionMapper;
import com.catland.modules.personality.service.PersonalityQuestionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 性格测试题库 服务实现类
 * </p>
 *
 * @author macro
 * @since 2023-08-19
 */
@Service
public class PersonalityQuestionServiceImpl extends ServiceImpl<PersonalityQuestionMapper, PersonalityQuestion> implements PersonalityQuestionService {

}
