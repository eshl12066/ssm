package com.slwx.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (YlZdxx)实体类
 *
 * @author makejava
 * @since 2019-10-29 21:48:28
 */
public class YlZdxx implements Serializable {
    private static final long serialVersionUID = -36535299775126388L;
    
    private Long rid;
    
    private String ddate;
    
    private String dname;
    
    private String pname;
    
    private String dmnos;
    
    private Long sno;

    public String getDdate() {
        return ddate;
    }

    public void setDdate(String ddate) {
        this.ddate = ddate;
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
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