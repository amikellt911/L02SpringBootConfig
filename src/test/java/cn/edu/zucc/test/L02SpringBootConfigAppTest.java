package cn.edu.zucc.test;

import cn.edu.zucc.ConfigurationPropertiesBean;
import cn.edu.zucc.ConfigurationPropertiesBeanValue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class L02SpringBootConfigAppTest {
    @Autowired
    private ConfigurationPropertiesBean configBean;

    @Autowired
    private ConfigurationPropertiesBeanValue configBeanValue;

    @Test
    public void contextLoads() {
        System.out.println(configBean);
        System.out.println(configBeanValue);
    }
}
