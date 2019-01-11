package pers.jaye.springbootdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * SpringMvc 自定义扩展类
 *
 * @Author 田杰熠
 * @Copyright Jaye pers. All rights reserved.
 * @Date 2019/1/11 9:28
 * @Version 1.0
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        /*registry.addViewController("/hello").setViewName("index");*/
    }


    /**
     * 添加参数转换
     *
     * @param registry
     */
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(getStringDateConverter());
        registry.addConverter(getStringToEmptyConverter());
    }


    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {

    }


    /**
     * 日期类型转换,解决日期类型参数不能字段绑定问题
     *
     * @return
     */
    private Converter<String, Date> getStringDateConverter() {
        return new Converter<String, Date>() {
            @Override
            public Date convert(String source) {
                try {
                    return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(source);
                } catch (ParseException e) {
                    try {
                        return new SimpleDateFormat("yyyy-MM-dd").parse(source);
                    } catch (ParseException e1) {
                        try {
                            return new SimpleDateFormat("HH:mm:ss").parse(source);
                        } catch (ParseException e2) {
                            e2.printStackTrace();
                            return null;
                        }
                    }
                }

            }
        };
    }

    /**
     * 字符串类型转换,当字符串为null和“”时,统一为null.这样在controller类中就不用对字符串进行为“”的判断
     *
     * @return
     */
    private Converter<String, String> getStringToEmptyConverter() {
        return new Converter<String, String>() {
            @Override
            public String convert(String source) {
                if (source == null) {
                    return null;
                }
                String trim = source.trim();
                if ("".equals(trim)) {
                    return null;
                }
                return trim;
            }
        };
    }

}
