package com.example.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 *
 * @author nthack
 * @date 2021-04-20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class BusinessException extends RuntimeException{
    private Integer statusCode;

    public BusinessException(String message, Integer statusCode){
        super(message);
        this.statusCode = statusCode;
    }

    public BusinessException(String message){
        super(message);
    }

}
