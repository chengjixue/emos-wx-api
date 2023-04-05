package edu.jayhsueh.emos.wx.controller.form;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @author xuecj
 * @version 1.0
 * @date 2023/4/5 15:58
 */
@ApiModel
@Data
public class TestSayHelloForm {
    @NotBlank
    @Pattern(regexp = "^[\\u4e00-\\u9fa5]{2,20}$")
    @ApiModelProperty("姓名")
    private String name;

}
