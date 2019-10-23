package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlLx)实体类
 *
 * @author makejava
 * @since 2019-10-23 16:41:21
 */
public class YlLx implements Serializable {
    private static final long serialVersionUID = 742783663535364328L;
    
    private Long lxno;
    
    private String lxname;
    
    private Integer lxprice;


    public Long getLxno() {
        return lxno;
    }

    public void setLxno(Long lxno) {
        this.lxno = lxno;
    }

    public String getLxname() {
        return lxname;
    }

    public void setLxname(String lxname) {
        this.lxname = lxname;
    }

    public Integer getLxprice() {
        return lxprice;
    }

    public void setLxprice(Integer lxprice) {
        this.lxprice = lxprice;
    }

}