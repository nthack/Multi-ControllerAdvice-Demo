package com.example.exceptions.handler;

import com.example.exceptions.AccountException;
import com.example.exceptions.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 * @author Jerry Sung
 * @date 2021-04-21
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Handle {@link BusinessException} in global
     *
     * @param ex {@link BusinessException}
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    public ResponseEntity handleBusinessException(BusinessException ex){
        // you can define a Standard Structure response data
        // this just for testing, I wouldn't do like this
        Map<String, Object> map = new HashMap<>(2);
        map.put("statusCode", ex.getStatusCode().toString());
        map.put("msg", ex.getMessage());

        log.warn("BusinessException ---> statusCode:{}, message:{}",ex.getStatusCode(), ex.getMessage());

        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(map);
    }


    /**
     * Handle {@link AccountException}
     *
     * @param ex {@link AccountException}
     * @return
     */
    @ExceptionHandler(AccountException.class)
    public ResponseEntity handleAccountException(AccountException ex){
        // you can define a Standard Structure response data
        // this just for testing, I wouldn't do like this
        Map<String, Object> map = new HashMap<>(2);
        map.put("statusCode", ex.getStatusCode().toString());
        map.put("msg", ex.getMessage());

        log.warn("AccountException ---> statusCode:{}, message:{}",ex.getStatusCode(), ex.getMessage());

        return ResponseEntity
                .status(HttpStatus.UNAUTHORIZED)
                .body(map);
    }


    /**
     * Handle All Exception
     * In normal, this might not be execute
     * Just in case for some stupid throw non-RuntimeException
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity handleException(Exception ex){
        // you can define a Standard Structure response data
        // this just for testing, I wouldn't do like this
        Map<String, Object> map = new HashMap<>(1);
        map.put("msg", "This is a exception that not be specific, " + ex.getMessage());

        log.warn("Exception ---> This is a exception that not be specific, message:{}", ex.getMessage());

        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(map);
    }
}
