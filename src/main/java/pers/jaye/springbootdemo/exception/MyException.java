package pers.jaye.springbootdemo.exception;

/**
 * 异常信息类
 *
 * @Author 田杰熠
 * @Copyright Jaye pers. All rights reserved.
 * @Date 2019/1/9 13:58
 * @Version 1.0
 */
public class MyException extends RuntimeException {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}