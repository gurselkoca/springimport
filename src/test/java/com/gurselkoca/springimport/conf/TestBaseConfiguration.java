package com.gurselkoca.springimport.conf;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class TestBaseConfiguration {

    @Bean("testBean")
    public String testBean(){
        return "testBean";
    }
}
