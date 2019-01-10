package pers.jaye.springbootdemo.Service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.jaye.springbootdemo.mapper.UserMapper;
import pers.jaye.springbootdemo.model.UserDo;

import javax.annotation.Resource;
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
@CacheConfig(cacheNames = "User")
public class UserService {

    @Resource
    private UserMapper userMapper;

    @Transactional
    @CacheEvict(allEntries = true)
    public void insertUser(UserDo userDo) {
        userMapper.insertUser(userDo);
    }

    @Transactional
    public void insertUser1(UserDo userDo) {
        userMapper.insertUser(userDo);
        int i = 1 / 0;
    }

    @Cacheable
    public List<UserDo> listAllUser() {
        return userMapper.listAllUser();
    }

}
