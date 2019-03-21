package com.frico.crmcommon.exception;

import com.frico.crmcommon.Enum.ResultEnum;
import lombok.Data;

@Data
public class CrmException extends RuntimeException {
    private static final long serialVersionUID = -8335559753316894528L;

    private String code;

    public CrmException(String message) {
        super(message);
    }

    public CrmException(String code, String message) {
        super(message);
        this.code = code;
    }

    public CrmException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}
