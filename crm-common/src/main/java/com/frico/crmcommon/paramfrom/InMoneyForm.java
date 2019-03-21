package com.frico.crmcommon.paramfrom;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Data
public class InMoneyForm {
    @NotBlank(message="交易账户不能为空")
    private String account;
    @NotBlank(message="入金金额不能为空")
    private BigDecimal amount;
    @NotBlank(message="入金方式不能为空")
    private String inWay;

}
