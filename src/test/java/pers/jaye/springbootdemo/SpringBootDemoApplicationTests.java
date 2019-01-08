package pers.jaye.springbootdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pers.jaye.springbootdemo.mapper.DeptMapper;
import pers.jaye.springbootdemo.mapper.EmpMapper;
import pers.jaye.springbootdemo.model.DeptDo;
import pers.jaye.springbootdemo.model.EmpDo;
import pers.jaye.springbootdemo.model.Person;
import pers.jaye.springbootdemo.model.Person1;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {

    @Resource
    private Person person;


    @Resource
    private Person1 person1;

    @Resource
    private DataSource dataSource;

    @Resource
    private DeptMapper deptMapper;

    @Resource
    private EmpMapper empMapper;

    @Test
    public void contextLoads() {
        System.out.printf(person.toString());
        System.out.printf(person1.toString());
    }


    @Test
    public void dataSourceTest(){
        DataSource dataSource = this.dataSource;
    }


    @Test
    public void mybatisTest(){
        List<DeptDo> deptDos = deptMapper.listEmpDos();
        System.out.printf("部门的长度:" + deptDos.size());
        List<EmpDo> empDos = empMapper.listAllEmp();
        System.out.printf("员工的长度:" + empDos.size());
    }

}

