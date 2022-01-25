package com.spiet.springjenkins;

import org.apache.juli.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;


@SpringBootApplication
@RestController
public class SpringJenkinsApplication {

    public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

    @GetMapping(path = "/test")
    public ResponseEntity<String> helloJenkins() {
        return ResponseEntity.ok("Hello Jenkins");
    }

    @PostConstruct
    public void init() {
        logger.info("Application Running...");
    }
    public static void main(String[] args) {
        logger.info("Application Executing...");

        SpringApplication.run(SpringJenkinsApplication.class, args);
    }

}
