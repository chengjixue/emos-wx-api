package edu.jayhsueh.emos.wx.controller;

import edu.jayhsueh.emos.wx.common.util.R;
import edu.jayhsueh.emos.wx.controller.form.TestSayHelloForm;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author xuecj
 * @version 1.0
 * @date 2023/4/5 0:33
 */
@RestController
@RequestMapping("/test")
@Api("测试方法")
public class TestController {
    @PostMapping("/sayHello")
    @ApiOperation("测试方法")
    public R sayHello(@Valid @RequestBody TestSayHelloForm form){
        return R.ok().put("message",form.getName());
    }
}
