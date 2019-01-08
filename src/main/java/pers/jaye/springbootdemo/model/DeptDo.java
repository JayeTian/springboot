package pers.jaye.springbootdemo.model;

import org.springframework.stereotype.Component;

/**
 * TODO 在此加入类描述
 *
 * @Author 田杰熠
 * @Copyright Jaye pers. All rights reserved.
 * @Date 2019/1/8 11:50
 * @Version 1.0
 */
@Component
public class DeptDo {

    private int dno;

    private String dname;

    private String loc;

    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "DeptDo{" +
                "dno=" + dno +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
