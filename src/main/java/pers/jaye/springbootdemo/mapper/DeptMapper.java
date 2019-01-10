package pers.jaye.springbootdemo.mapper;

import org.apache.ibatis.annotations.*;
import pers.jaye.springbootdemo.model.DeptDo;
import java.util.List;

@Mapper
public interface DeptMapper {

    @Options(useGeneratedKeys = true, keyProperty = "dno")
    @Insert("insert into dept (dno,dname,loc) values (#{dno},#{dname},#{loc})")
    void insert(DeptDo deptDo);

    @Delete("delect from dept where dno = #{dno}")
    void delect(int dno);

    @Update("update dept set dname = #{dname} , loc = #{loc} where dno = #{dno}")
    void update(DeptDo deptDo);

    @Select("select dno,dname,loc from dept where dno = #{dno}")
    DeptDo getDept(int dno);

    @Select("select dno,dname,loc from dept")
    List<DeptDo> listAllDepts();
}
