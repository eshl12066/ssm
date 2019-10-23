package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlDdx)实体类
 *
 * @author makejava
 * @since 2019-10-23 16:41:18
 */
public class YlDdx implements Serializable {
    private static final long serialVersionUID = 455852286763381625L;
    
    private Long yddxid;
    
    private Long ydid;
    
    private Long dno;
    
    private Integer shul;
    
    private Object sprice;


    public Long getYddxid() {
        return yddxid;
    }

    public void setYddxid(Long yddxid) {
        this.yddxid = yddxid;
    }

    public Long getYdid() {
        return ydid;
    }

    public void setYdid(Long ydid) {
        this.ydid = ydid;
    }

    public Long getDno() {
        return dno;
    }

    public void setDno(Long dno) {
        this.dno = dno;
    }

    public Integer getShul() {
        return shul;
    }

    public void setShul(Integer shul) {
        this.shul = shul;
    }

    public Object getSprice() {
        return sprice;
    }

    public void setSprice(Object sprice) {
        this.sprice = sprice;
    }

}