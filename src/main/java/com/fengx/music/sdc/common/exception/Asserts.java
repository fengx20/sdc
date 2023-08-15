package com.fengx.music.sdc.common.exception;

import com.fengx.music.sdc.common.api.IErrorCode;

/**
 * 描述：断言处理类，用于抛出各种API异常
 *
 * @author fengx
 */
public class Asserts {

    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }

}
