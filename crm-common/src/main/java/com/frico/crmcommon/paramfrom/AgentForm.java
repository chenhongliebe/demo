package com.frico.crmcommon.paramfrom;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class AgentForm {
    @NotBlank(message = "机构名称不能为空")
    private String organizationName;//机构名称
    @NotBlank(message = "机构证号不能为空")
    private String organizationNo;//机构证号
    @NotBlank(message = "机构照不能为空")
    private String organizationImg;//机构照
    @NotBlank(message = "代理类型不能为空")
    private String agentType;//代理类型 1个人代理 2机构代理
    @NotNull(message = "开设时间不能为空")
    private Integer openTime;//开设时间（年为单位）


    @ApiModelProperty(value = "真实姓名",required = true)
    @NotBlank(message = "真实姓名不能为空")
    private String realName;//真实姓名
    @ApiModelProperty(value = "杠杆",required = true)
    @NotBlank(message = "杠杆不能为空")
    private String lever;//杠杆
    @ApiModelProperty(value = "组别",required = true)
    @NotBlank(message = "组别不能为空")
    private String mt4Group;//组别
    @ApiModelProperty(value = "性别",required = true)
    @NotBlank(message = "性别不能为空")
    private String gender;//性别
    @ApiModelProperty(value = "邮箱",required = true)
    @NotBlank(message = "邮箱不能为空")
    private String email;//邮箱
    @ApiModelProperty(value = "手机号",required = true)
    @NotBlank(message = "手机号不能为空")
    private String mobile;//手机号
    @ApiModelProperty(value = "身份证号",required = true)
    @NotBlank(message = "身份证号不能为空")
    private String idNum;//身份证号
    @ApiModelProperty(value = "银行名称",required = true)
    @NotBlank(message = "银行名称不能为空")
    private String bankName;//银行名称
    @ApiModelProperty(value = "银行卡号",required = true)
    @NotBlank(message = "银行卡号不能为空")
    private String bankNum;//银行卡号
    @ApiModelProperty(value = "支行",required = true)
    @NotBlank(message = "支行不能为空")
    private String bankBranch;//支行

    @ApiModelProperty(value = "详细地址",required = true)
    @NotBlank(message = "详细地址不能为空")
    private String detailAddress;//详细地址
    @ApiModelProperty(value = "身份证正面",required = true)
    @NotBlank(message = "身份证正面不能为空")
    private String idPositive;//身份证正面
    @ApiModelProperty(value = "身份证反面",required = true)
    @NotBlank(message = "身份证反面不能为空")
    private String idOpposite;//身份证反面
    @ApiModelProperty(value = "银行卡正面",required = true)
    @NotBlank(message = "银行卡正面不能为空")
    private String bankPositive;//银行卡正面
    @ApiModelProperty(value = "银行卡反面",required = true)
    @NotBlank(message = "银行卡反面不能为空")
    private String bankOpposite;//银行卡反面
    @ApiModelProperty(value = "国家",required = true)
    @NotBlank(message = "国家不能为空")
    private String country;//国家
    @ApiModelProperty(value = "省份",required = true)
    @NotBlank(message = "省份不能为空")
    private String province;//省份
    @ApiModelProperty(value = "城市",required = true)
    @NotBlank(message = "城市不能为空")
    private String city;//城市
    @ApiModelProperty(value = "区域",required = true)
    @NotBlank(message = "区域不能为空")
    private String area;//区域

    private Integer superiorAgent;//上级代理
}
