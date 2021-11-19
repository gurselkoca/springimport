package com.gurselkoca.springimport.conf;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(properties = {"spring.main.allow-bean-definition-overriding=true"})
public class ConfigurationTest {

    @Autowired
    private String testBean;

    @Test
    public void testTestBean(){
        assertThat(testBean).isNotNull();
        assertThat(testBean).isEqualTo("prodBean");
    }

}
