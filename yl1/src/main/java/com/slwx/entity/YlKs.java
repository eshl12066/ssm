package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlKs)实体类
 *
 * @author makejava
 * @since 2019-10-29 21:48:27
 */
public class YlKs implements Serializable {
    private static final long serialVersionUID = 724837636177623065L;
    
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