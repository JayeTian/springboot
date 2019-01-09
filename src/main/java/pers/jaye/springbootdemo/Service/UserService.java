package pers.jaye.springbootdemo.Service;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.jaye.springbootdemo.mapper.UserMapper;
import pers.jaye.springbootdemo.model.UserDo;

import javax.annotation.Resource;
import java.beans.Expression;
import java.util.List;

/**
 * TODO 在此加入类描述
 *
 * @Author 田杰熠
 * @Copyright Jaye pers. All rights reserved.
 * @Date 2019/1/9 13:16
 * @Version 1.0
 */
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    @Transactional
    public void insertUser(UserDo userDo) {
        userMapper.insertUser(userDo);
    }

    @Transactional
    public void insertUser1(UserDo userDo) {
        userMapper.insertUser(userDo);
        int i = 1 / 0;
    }

    public List<UserDo> listAllUser() {
        return userMapper.listAllUser();
    }

}
