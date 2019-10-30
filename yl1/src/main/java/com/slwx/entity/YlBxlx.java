package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlBxlx)实体类
 *
 * @author makejava
 * @since 2019-10-29 21:48:27
 */
public class YlBxlx implements Serializable {
    private static final long serialVersionUID = -42941505503163137L;
    
    private Long bno;
    
    private String bname;
    
    private Object bratio;


    public Long getBno() {
        return bno;
    }

    public void setBno(Long bno) {
        this.bno = bno;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Object getBratio() {
        return bratio;
    }

    public void setBratio(Object bratio) {
        this.bratio = bratio;
    }

}