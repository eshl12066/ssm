package com.slwx.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (YlZdxx)实体类
 *
 * @author makejava
 * @since 2019-10-23 16:41:22
 */
public class YlZdxx implements Serializable {
    private static final long serialVersionUID = 251836178696593336L;
    
    private Long rid;
    
    private Date ddate;
    
    private String dname;
    
    private String pname;
    
    private String dmnos;
    
    private Long sno;


    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Date getDdate() {
        return ddate;
    }

    public void setDdate(Date ddate) {
        this.ddate = ddate;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getDmnos() {
        return dmnos;
    }

    public void setDmnos(String dmnos) {
        this.dmnos = dmnos;
    }

    public Long getSno() {
        return sno;
    }

    public void setSno(Long sno) {
        this.sno = sno;
    }

}