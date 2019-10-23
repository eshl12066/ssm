package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlYsxx)实体类
 *
 * @author makejava
 * @since 2019-10-23 16:41:22
 */
public class YlYsxx implements Serializable {
    private static final long serialVersionUID = 224027514721639788L;
    
    private Long dno;
    
    private String dname;
    
    private Integer dage;
    
    private String sname;
    
    private Long sno;
    
    private Long lxno;
    
    private Long bmid;
    
    private Integer dutime;
    
    private Integer ddtime;


    public Long getDno() {
        return dno;
    }

    public void setDno(Long dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Integer getDage() {
        return dage;
    }

    public void setDage(Integer dage) {
        this.dage = dage;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Long getSno() {
        return sno;
    }

    public void setSno(Long sno) {
        this.sno = sno;
    }

    public Long getLxno() {
        return lxno;
    }

    public void setLxno(Long lxno) {
        this.lxno = lxno;
    }

    public Long getBmid() {
        return bmid;
    }

    public void setBmid(Long bmid) {
        this.bmid = bmid;
    }

    public Integer getDutime() {
        return dutime;
    }

    public void setDutime(Integer dutime) {
        this.dutime = dutime;
    }

    public Integer getDdtime() {
        return ddtime;
    }

    public void setDdtime(Integer ddtime) {
        this.ddtime = ddtime;
    }

}