package pers.jaye.springbootdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 统一Controller类方法参数的类型转换
 *
 * @Author 田杰熠
 * @Copyright Jaye pers. All rights reserved.
 * @Date 2019/1/7 14:47
 * @Version 1.0
 */
@Configuration
public class ParametersConverterConfig {


    /**
     * 日期类型转换,解决日期类型参数不能字段绑定问题
     *
     * @return
     */
    @Bean
    public Converter<String, Date> addNewDateConverter() {
        return new Converter<String, Date>() {
            @Override
            public Date convert(String s) {
                try {
                    return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(s);
                } catch (ParseException e) {
                    try {
                        return new SimpleDateFormat("yyyy-MM-dd").parse(s);
                    } catch (ParseException e1) {
                        try {
                            return new SimpleDateFormat("HH:mm:ss").parse(s);
                        } catch (ParseException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                return null;
            }
        };
    }


    /**
     * 字符串类型转换,当字符串为null和“”时,统一为null.这样在controller类中就不用对字符串进行为“”的判断
     *
     * @return
     */
    @Bean
    public Converter<String, String> addNewStringConverter() {
        return new Converter<String, String>() {
            @Override
            public String convert(String s) {
                if (s == null) {
                    return null;
                }
                String trim = s.trim();
                if ("".equals(trim)) {
                    return null;
                }
                return trim;
            }
        };
    }

}
