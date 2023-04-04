package edu.jayhsueh.emos.wx.controller;

import edu.jayhsueh.emos.wx.common.util.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuecj
 * @version 1.0
 * @date 2023/4/5 0:33
 */
@RestController
@RequestMapping("/test")
@Api("测试方法")
public class TestController {
    @GetMapping("/sayHello")
    @ApiOperation("测试方法")
    public R sayHello(){
        return R.ok().put("message","HelloWorld");
    }
}
