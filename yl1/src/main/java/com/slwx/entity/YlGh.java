package com.slwx.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (YlGh)实体类
 *
 * @author makejava
 * @since 2019-10-29 21:48:27
 */
public class YlGh implements Serializable {
    private static final long serialVersionUID = 578857667719098227L;
    
    private Long rno;
    
    private String pname;
    
    private Long pid;
    
    private String rcost;
    
    private String sname;
    
    private Long dno;
    
    private String rtime;

    public String getRtime() {
        return rtime;
    }

    public void setRtime(String rtime) {
        this.rtime = rtime;
    }

    public Long getRno() {
        return rno;
    }

    public void setRno(Long rno) {
        this.rno = rno;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getRcost() {
        return rcost;
    }

    public void setRcost(String rcost) {
        this.rcost = rcost;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Long getDno() {
        return dno;
    }

    public void setDno(Long dno) {
        this.dno = dno;
    }

}