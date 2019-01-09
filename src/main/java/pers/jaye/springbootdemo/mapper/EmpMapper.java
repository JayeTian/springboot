package pers.jaye.springbootdemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import pers.jaye.springbootdemo.model.EmpDo;

import java.util.List;

/**
 * TODO 在此加入类描述
 *
 * @Author 田杰熠
 * @Copyright Jaye pers. All rights reserved.
 * @Date 2019/1/8 11:57
 * @Version 1.0
 */
@Mapper
public interface EmpMapper {

    void insert(EmpDo empDo);

    void deleteByPrimaryKey(int id);

    void updateByPrimaryKeySelective(EmpDo empDo);

    EmpDo getEmp(int id);

    List<EmpDo> listAllEmp();
}
