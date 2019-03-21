package com.frico.crmcommon.paramfrom;

import lombok.Data;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
public class OutMoneyForm {
    @NotNull(message = "用户账号不能为空")
    private Integer account;
    @DecimalMin(value = "10.00",message = "出金金额不能低于10美元")
    private BigDecimal outAmount;
    @NotNull(message = "银行卡主键不能为空")
    private Integer bankId;
    //备注
    private String remarks;



}
