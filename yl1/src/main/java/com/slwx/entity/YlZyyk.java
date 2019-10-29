package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlZyyk)实体类
 *
 * @author makejava
 * @since 2019-10-29 21:48:28
 */
public class YlZyyk implements Serializable {
    private static final long serialVersionUID = 438499606257717302L;
    
    private Long zyno;
    
    private String zyname;
    
    private Object zyprice;
    
    private Long zylx;
    
    private Integer zykc;
    
    private Integer zybx;


    public Long getZyno() {
        return zyno;
    }

    public void setZyno(Long zyno) {
        this.zyno = zyno;
    }

    public String getZyname() {
        return zyname;
    }

    public void setZyname(String zyname) {
        this.zyname = zyname;
    }

    public Object getZyprice() {
        return zyprice;
    }

    public void setZyprice(Object zyprice) {
        this.zyprice = zyprice;
    }

    public Long getZylx() {
        return zylx;
    }

    public void setZylx(Long zylx) {
        this.zylx = zylx;
    }

    public Integer getZykc() {
        return zykc;
    }

    public void setZykc(Integer zykc) {
        this.zykc = zykc;
    }

    public Integer getZybx() {
        return zybx;
    }

    public void setZybx(Integer zybx) {
        this.zybx = zybx;
    }

}