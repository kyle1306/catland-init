package com.catland;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.catland.modules.personality.mapper.PersonalityQuestionMapper;
import com.catland.modules.personality.model.PersonalityQuestion;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @Author: wangkai
 * @Date: 2023/8/19 9:20 下午
 */
@SpringBootTest
public class PersonalityTest {
    @Resource
    private PersonalityQuestionMapper questionMapper;

    @Test
    public void testSelect() {
        QueryWrapper<PersonalityQuestion> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(PersonalityQuestion::getQuestionType, 1);
        List<PersonalityQuestion> list = questionMapper.selectList(wrapper);
        Assert.notNull(list, "查询结果为空");
    }
}
