package com.catland.modules.cat.controller;

import com.catland.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author: wangkai
 * @Date: 2023/6/10 10:08 下午
 */
@Controller
@Slf4j
@Api(tags = "TestController")
@Tag(name = "TestController", description = "测试Controller")
@RequestMapping("/test")
public class TestController {

    @ApiOperation(value = "hello测试")
    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<String> hello() {
        return CommonResult.success("hello catLand ...");
    }
}
