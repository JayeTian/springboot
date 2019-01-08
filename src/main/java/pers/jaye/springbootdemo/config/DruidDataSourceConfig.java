package pers.jaye.springbootdemo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

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
    public DataSource getDruidDataSource() {
        return new DruidDataSource();
    }




}
