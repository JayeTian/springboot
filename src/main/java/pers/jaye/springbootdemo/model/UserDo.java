package pers.jaye.springbootdemo.model;

import org.springframework.stereotype.Component;

/**
 * TODO 在此加入类描述
 *
 * @Author 田杰熠
 * @Copyright Jaye pers. All rights reserved.
 * @Date 2019/1/9 12:53
 * @Version 1.0
 */
@Component
public class UserDo {

    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserDo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
