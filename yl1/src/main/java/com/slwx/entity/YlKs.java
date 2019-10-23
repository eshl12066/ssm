package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlKs)实体类
 *
 * @author makejava
 * @since 2019-10-23 16:41:21
 */
public class YlKs implements Serializable {
    private static final long serialVersionUID = 447418800911721412L;
    
    private Long sno;
    
    private String sname;


    public Long getSno() {
        return sno;
    }

    public void setSno(Long sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

}