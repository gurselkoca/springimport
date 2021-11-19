package com.gurselkoca.springimport.conf;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(properties = {"spring.main.allow-bean-definition-overriding=true"})
@Import(TestBaseConfiguration.class)
public class ConfigurationWithImportIT {

    @Autowired
    @Qualifier("testBean")
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
