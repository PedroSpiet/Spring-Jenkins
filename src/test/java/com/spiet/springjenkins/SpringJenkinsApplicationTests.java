package com.spiet.springjenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {

    public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

    @Test
    void contextLoads() {
        logger.info("Test case executing...");
        Assertions.assertEquals(1, 1);
    }

}
