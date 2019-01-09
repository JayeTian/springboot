package pers.jaye.springbootdemo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 统一异常处理类
 *
 * @Author 田杰熠
 * @Copyright Jaye pers. All rights reserved.
 * @Date 2019/1/9 14:00
 * @Version 1.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {


    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Map<String, Object> errorHandler(HttpServletRequest req, Exception ex) {
        Map<String, Object> map = new HashMap<>();
        map.put("url", req.getRequestURL());
        map.put("msg", ex.getMessage());
        return map;
    }

    @ResponseBody
    @ExceptionHandler(MyException.class)
    public Map<String, Object> myErrorHandler(HttpServletRequest req, MyException ex) {
        Map<String, Object> map = new HashMap<>();
        map.put("url", req.getRequestURL());
        map.put("msg", ex.getMsg());
        return map;
    }


}