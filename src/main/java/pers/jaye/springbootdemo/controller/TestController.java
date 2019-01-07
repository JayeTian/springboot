package pers.jaye.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * TODO 在此加入类描述
 *
 * @Author 田杰熠
 * @Copyright Jaye pers. All rights reserved.
 * @Date 2019/1/7 14:39
 * @Version 1.0
 */
@RestController
public class TestController {


    @RequestMapping("/hello")
    public String hello() {
        return "hello world!";
    }

    @RequestMapping("hello1")
    public String hello1(Date date, String name) {
        return "hello " + name + " " + date;
    }

}
