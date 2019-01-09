package pers.jaye.springbootdemo.model;

import org.springframework.stereotype.Component;

/**
 * TODO 在此加入类描述
 *
 * @Author 田杰熠
 * @Copyright Jaye pers. All rights reserved.
 * @Date 2019/1/8 11:55
 * @Version 1.0
 */
@Component
public class EmpDo {

    private int eid;

    private String ename;

    private String job;

    private int deptno;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "EmpDo{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", deptno=" + deptno +
                '}';
    }
}
