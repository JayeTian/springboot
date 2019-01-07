package pers.jaye.springbootdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pers.jaye.springbootdemo.model.Person;
import javax.annotation.Resource;
import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {

    @Resource
    private Person person;

    @Resource
    private DataSource dataSource;

    @Test
    public void contextLoads() {
        System.out.printf(person.toString());
    }



    @Test
    public void dataSourceTest(){
        DataSource dataSource = this.dataSource;
    }
}

