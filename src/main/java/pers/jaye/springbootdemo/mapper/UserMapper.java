package pers.jaye.springbootdemo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import pers.jaye.springbootdemo.model.UserDo;

import java.util.List;

@Mapper
public interface UserMapper {


    @Insert("insert into user (id, name) VALUES (#{id},#{name})")
    void insertUser(UserDo userDo);

    @Select("select id, name from user")
    List<UserDo> listAllUser();

}
