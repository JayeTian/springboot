package pers.jaye.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.jaye.springbootdemo.mapper.DeptMapper;
import pers.jaye.springbootdemo.mapper.EmpMapper;
import pers.jaye.springbootdemo.model.DeptDo;
import pers.jaye.springbootdemo.model.EmpDo;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

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

    @Resource
    private EmpMapper empMapper;

    @Resource
    private DeptMapper deptMapper;

    @RequestMapping("/hello")
    public String hello() {
        return "hello world!";
    }

    @RequestMapping("hello1")
    public String hello1(Date date, String name) {
        return "hello " + name + " " + date;
    }


    @RequestMapping("listAllEmp")
    public int listAllEmp() {
        List<EmpDo> empDos = empMapper.listAllEmp();
        return empDos.size();
    }

    @RequestMapping("listAllDept")
    public int listAllDept() {
        List<DeptDo> deptDos = deptMapper.listAllEmpDos();
        return deptDos.size();
    }

}
