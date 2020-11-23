package com.retire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAsync
@SpringBootApplication
public class RetireApplication {


    public static void main(String[] args) {
        SpringApplication.run(RetireApplication.class, args);
    }

}
