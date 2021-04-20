package com.example.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


/**
 * 账号异常类
 *
 * @author nthack
 * @date 2021-04-21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AccountException extends BusinessException {
    public AccountException(String message, Integer statusCode) {
        super(message, statusCode);
    }

    public AccountException(String message) {
        super(message);
    }
}
