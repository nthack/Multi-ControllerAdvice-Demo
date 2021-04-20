package com.example.exceptions;

import lombok.EqualsAndHashCode;


/**
 * 账号异常类
 *
 * @author nthack
 * @date 2021-04-21
 */
@EqualsAndHashCode(callSuper = true)
public class AccountException extends BusinessException {
    public AccountException(String message, Integer statusCode) {
        super(message, statusCode);
    }

    public AccountException(String message) {
        super(message);
    }
}
