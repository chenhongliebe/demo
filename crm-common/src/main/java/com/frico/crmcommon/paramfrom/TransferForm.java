package com.frico.crmcommon.paramfrom;

import lombok.Data;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Data
public class TransferForm {
    @NotBlank(message = "交易账户不能为空")
    private String account;
    @NotBlank(message = "转入账户不能为空")
    private String outAccount;
    @DecimalMin(value = "1.00",message = "内转金额不能低于1美元")
    private BigDecimal balance;

    private String remarks;



}
