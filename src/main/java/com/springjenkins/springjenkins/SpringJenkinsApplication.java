package com.springjenkins.springjenkins;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkinsApplication {

    Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

    @GetMapping("/print")
    public String getMessage(){
        logger.info("spring jenkins application : getMessage method started");
        return "hi welcome to jenkins application deployed successfully into jenkins";
    }

    public static void main(String[] args) {
        logger.info("jenkins application started");
        SpringApplication.run(SpringJenkinsApplication.class, args);
    }

}
