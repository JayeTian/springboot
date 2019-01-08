package pers.jaye.springbootdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TODO 在此加入类描述
 *
 * @Author 田杰熠
 * @Copyright Jaye pers. All rights reserved.
 * @Date 2019/1/8 16:13
 * @Version 1.0
 */
@Configuration
public class TestConfig {

    @Bean
    public String getString() {
        return "Jaye";
    }

}
