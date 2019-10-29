package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlLx)实体类
 *
 * @author makejava
 * @since 2019-10-29 21:48:27
 */
public class YlLx implements Serializable {
    private static final long serialVersionUID = 796296688905908456L;
    
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