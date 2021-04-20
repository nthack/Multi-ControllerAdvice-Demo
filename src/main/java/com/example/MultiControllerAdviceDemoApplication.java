package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 *
 * @author nthack
 * @date 2021-04-20
 */
@Slf4j
@SpringBootApplication
public class MultiControllerAdviceDemoApplication {

    public static void main(String[] args) {
        log.info("Starting Application MultiControllerAdviceDemo....");
        SpringApplication.run(MultiControllerAdviceDemoApplication.class, args);

        log.info("MultiControllerAdviceDemo Successfully started....");
    }

}
