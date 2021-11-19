package com.gurselkoca.springimport.conf;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(properties = {"spring.main.allow-bean-definition-overriding=true"})
@ContextConfiguration(classes = TestBaseConfiguration.class)
public class ConfigurationWithContextConfigurationTest {

    @Autowired
    private String testBean;

    @Autowired
    private String testBeanSecond;

    @Test
    public void testTestBean(){
        assertThat(testBean).isNotNull();
        assertThat(testBean).isEqualTo("testBean");

    }

    @Test
    public void testSecondBean(){
        assertThat(testBeanSecond).isNotNull();

    }
}
