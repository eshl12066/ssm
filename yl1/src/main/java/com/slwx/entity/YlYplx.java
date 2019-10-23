package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlYplx)实体类
 *
 * @author makejava
 * @since 2019-10-23 16:41:22
 */
public class YlYplx implements Serializable {
    private static final long serialVersionUID = -29325717716040548L;
    
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