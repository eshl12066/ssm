package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlZxyk)实体类
 *
 * @author makejava
 * @since 2019-10-23 16:41:22
 */
public class YlZxyk implements Serializable {
    private static final long serialVersionUID = -71294831290210014L;
    
    private Long yno;
    
    private String yname;
    
    private Object yprice;
    
    private Long ylx;
    
    private Integer ykc;
    
    private Integer ybx;


    public Long getYno() {
        return yno;
    }

    public void setYno(Long yno) {
        this.yno = yno;
    }

    public String getYname() {
        return yname;
    }

    public void setYname(String yname) {
        this.yname = yname;
    }

    public Object getYprice() {
        return yprice;
    }

    public void setYprice(Object yprice) {
        this.yprice = yprice;
    }

    public Long getYlx() {
        return ylx;
    }

    public void setYlx(Long ylx) {
        this.ylx = ylx;
    }

    public Integer getYkc() {
        return ykc;
    }

    public void setYkc(Integer ykc) {
        this.ykc = ykc;
    }

    public Integer getYbx() {
        return ybx;
    }

    public void setYbx(Integer ybx) {
        this.ybx = ybx;
    }

}