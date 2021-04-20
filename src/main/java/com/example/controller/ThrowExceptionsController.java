package com.example.controller;

import com.example.exceptions.AccountException;
import com.example.exceptions.BusinessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * API controller just throwing some Exception
 *
 * @author nthack
 * @date 2021-04-21
 */
@RestController
@RequestMapping("/")
public class ThrowExceptionsController {

    @RequestMapping("/account")
    public ResponseEntity throwAccountException() {
        throw new AccountException("Account Error", 401);
    }


    @RequestMapping("/business")
    public ResponseEntity throwBusinessException() {
        throw new BusinessException("Business Exception, plz check.", 500);
    }


    @RequestMapping("/exception")
    public ResponseEntity throwException() throws Exception {
        throw new Exception("Just Exception");
    }

}
