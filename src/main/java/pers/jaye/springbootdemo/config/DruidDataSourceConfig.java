package pers.jaye.springbootdemo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Druid 数据源配置类
 *
 * @Author 田杰熠
 * @Copyright Jaye pers. All rights reserved.
 * @Date 2019/1/7 17:50
 * @Version 1.0
 */
@Configuration
public class DruidDataSourceConfig {

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DruidDataSource getDruidDataSource() {
        return new DruidDataSource();
    }

}
