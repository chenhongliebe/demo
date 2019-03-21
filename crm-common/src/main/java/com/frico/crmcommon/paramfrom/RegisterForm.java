package com.frico.crmcommon.paramfrom;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class RegisterForm {
    @NotBlank(message = "昵称不能为空")
    private String nickname;
    @NotBlank(message = "手机号不能为空")
    private String mobile;
    @NotBlank(message = "手机号验证码不能为空")
    private String mobileCode;
    @Email(message = "请填写正确的邮箱格式")
    private String email;
    @NotBlank(message = "身份证号不能为空")
    private String idnumbermt;
    @NotBlank(message = "国家不能为空")
    private String nationmt;
    @NotBlank(message = "省份不能为空")
    private String provincemt;
    @NotBlank(message = "城市不能为空")
    private String citymt;
    private String msg_type;

}
