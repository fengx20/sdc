package com.fengx.music.sdc.common.exception;

import com.fengx.music.sdc.common.api.IErrorCode;
import lombok.Getter;

/**
 * 描述：自定义API异常
 *
 * @author fengx
 */
@Getter
public class ApiException extends RuntimeException {
    private IErrorCode errorCode;

    public ApiException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

}
