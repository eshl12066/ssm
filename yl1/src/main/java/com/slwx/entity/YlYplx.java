package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlYplx)实体类
 *
 * @author makejava
 * @since 2019-10-29 21:48:28
 */
public class YlYplx implements Serializable {
    private static final long serialVersionUID = 432622427818293461L;
    
    private Long ylxno;
    
    private String ylxname;


    public Long getYlxno() {
        return ylxno;
    }

    public void setYlxno(Long ylxno) {
        this.ylxno = ylxno;
    }

    public String getYlxname() {
        return ylxname;
    }

    public void setYlxname(String ylxname) {
        this.ylxname = ylxname;
    }

}