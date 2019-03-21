package com.frico.crmcommon.Enum;

import lombok.Getter;

@Getter
public enum SocketEnum {

    MSGTYPE_1001("1001","开户"),
    MSGTYPE_1002("1002","入金"),
    MSGTYPE_1003("1003","出金"),
    MSGTYPE_1004("1004","划转"),
    MSGTYPE_1005("1005","获取用户详情"),
    MSGTYPE_1006("1006","更改杠杆"),
    MSGTYPE_1007("1007","手机号"),
    MSGTYPE_1008("1008","邮箱"),
    MSGTYPE_1009("1009","交易密码"),
    MSGTYPE_1010("1010","只读密码");

    private String code;
    private String msg;

    SocketEnum(String code,String msg) {
        this.code = code;
        this.msg = msg;
    }
}
