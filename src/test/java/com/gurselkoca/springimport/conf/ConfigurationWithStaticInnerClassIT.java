package com.gurselkoca.springimport.conf;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(properties = {"spring.main.allow-bean-definition-overriding=true"})
public class ConfigurationWithStaticInnerClassIT {

    @TestConfiguration
    public static class TestBeanConfiguration {

        @Bean("testBean")
         public String testBean(){
            return "testBean";
        }
    }

    @Autowired
    @Qualifier("testBean")
    private String testBean;

    @Test
    public void testTestBean(){
        assertThat(testBean).isNotNull();
        assertThat(testBean).isEqualTo("testBean");
    }

}
