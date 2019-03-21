package com.frico.crmcommon.Enum;

public enum  TokenExceptionEnum {

    /**
     * token异常
     */
    TOKEN_EXPIRED("700", "token过期"),
    TOKEN_ERROR("701", "token验证失败");

    private String code;
    private String msg;

    TokenExceptionEnum(String code,String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
