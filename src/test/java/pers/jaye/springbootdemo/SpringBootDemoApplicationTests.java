package pers.jaye.springbootdemo;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;
import pers.jaye.springbootdemo.Service.UserService;
import pers.jaye.springbootdemo.mapper.DeptMapper;
import pers.jaye.springbootdemo.mapper.EmpMapper;
import pers.jaye.springbootdemo.model.*;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {

    @Resource
    private Person person;

    @Resource
    private Person1 person1;

    @Resource
    private Person2 person2;

    @Resource
    private DataSource dataSource;

    @Resource
    private DeptMapper deptMapper;

    @Resource
    private EmpMapper empMapper;

    @Resource
    private UserService userService;


    @Resource
    private Environment env;


    @Test
    public void contextLoads() {
        System.out.printf(person.toString());
        System.out.printf(person1.toString());
        System.out.printf(person2.toString());
    }

    @Test
    public void EnvironmentTest() {

        //获取当前活跃的配置
        String[] activeProfiles = env.getActiveProfiles();
        Assert.assertEquals(activeProfiles[0], "dev");

        //获取当前默认的配置
        String[] defaultProfiles = env.getDefaultProfiles();
        Assert.assertEquals(defaultProfiles[0], "default");

        String s = env.getProperty("person.first-name");
        Assert.assertEquals(s, "田");

        String property = env.getProperty("person.name");
        Assert.assertEquals(property, "杰熠");

        Integer integer = env.getProperty("person.age", Integer.class);
        Assert.assertTrue(integer == 28);

        Date date = env.getProperty("person.birth", Date.class);
        Assert.assertNotNull(date);

        Boolean aBoolean = env.getProperty("person.boss", Boolean.class);
        Assert.assertTrue(aBoolean);

        Map<String, Object> map = env.getProperty("person.maps", Map.class);
        Assert.assertNull(map);

        List list = env.getProperty("person.list", List.class);
        Assert.assertNull(list);

        Car car = env.getProperty("person.car", Car.class);
        Assert.assertNull(car);
    }


    @Test
    public void dataSourceTest() {
        DataSource dataSource = this.dataSource;
    }


    @Test
    public void mybatisTest() {
        List<DeptDo> deptDos = deptMapper.listAllDepts();
        Assert.assertTrue(deptDos.size() == 34);

        List<EmpDo> empDos = empMapper.listAllEmp();
        Assert.assertTrue(empDos.size() == 800000);
    }


    @Test
    public void transactionalTest() {
        UserDo userDo = new UserDo();
        userDo.setId("5");
        userDo.setName("Jaye5");
        userService.insertUser(userDo);
//        userService.insertUser1(userDo);
    }


    @Test
    public void redisTest(){
        List<UserDo> userDos = userService.listAllUser();
        System.out.printf(userDos.toString());
    }

    @Test
    public void redisTest1(){
        UserDo userDo = new UserDo();
        userDo.setId("7");
        userDo.setName("Jaye7");
        userService.insertUser(userDo);
    }

}

