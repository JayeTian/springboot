package pers.jaye.springbootdemo.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * mybatis 配置类
 *  setMapUnderscoreToCamelCase 下划线转换为驼峰模式
 *      Underscore  下划线
 *      Camel Case  驼峰大小写
 *
 * @Author 田杰熠
 * @Copyright Jaye pers. All rights reserved.
 * @Date 2019/1/8 13:55
 * @Version 1.0
 */
@Configuration
public class MybatisConfig {

    @Bean
    public ConfigurationCustomizer getConfigurationCustomizer(){
        return new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }


}
