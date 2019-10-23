package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlMzyk)实体类
 *
 * @author makejava
 * @since 2019-10-23 16:41:21
 */
public class YlMzyk implements Serializable {
    private static final long serialVersionUID = 800824050927740674L;
    
    private Long myno;
    
    private String myname;
    
    private Object myprice;
    
    private Long mylx;
    
    private Integer mykc;
    
    private Integer mybx;


    public Long getMyno() {
        return myno;
    }

    public void setMyno(Long myno) {
        this.myno = myno;
    }

    public String getMyname() {
        return myname;
    }

    public void setMyname(String myname) {
        this.myname = myname;
    }

    public Object getMyprice() {
        return myprice;
    }

    public void setMyprice(Object myprice) {
        this.myprice = myprice;
    }

    public Long getMylx() {
        return mylx;
    }

    public void setMylx(Long mylx) {
        this.mylx = mylx;
    }

    public Integer getMykc() {
        return mykc;
    }

    public void setMykc(Integer mykc) {
        this.mykc = mykc;
    }

    public Integer getMybx() {
        return mybx;
    }

    public void setMybx(Integer mybx) {
        this.mybx = mybx;
    }

}