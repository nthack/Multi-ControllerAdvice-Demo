package com.example.exceptions;

import lombok.EqualsAndHashCode;


/**
 * Account Exception
 * 1. Account frozen
 * 2. password error
 * 3. UnAuthentication
 * 4. UnAuthorized
 * 5. etc....
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
