package com.gurselkoca.springimport.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseConfiguration {

    @Bean("testBean")
    public String testBean(){
        return "prodBean";
    }

    @Bean
    public String testBeanSecond(){
        return "prodBeanSecond";
    }
}
