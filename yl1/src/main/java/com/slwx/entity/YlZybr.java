package com.slwx.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (YlZybr)实体类
 *
 * @author makejava
 * @since 2019-10-23 16:41:23
 */
public class YlZybr implements Serializable {
    private static final long serialVersionUID = 900336720305216086L;
    
    private Long ihno;
    
    private Long bfid;
    
    private String brname;
    
    private Long bcid;
    
    private Long dno;
    
    private String dadevice;
    
    private Date itime;
    
    private Date otime;
    
    private Integer ychange;
    
    private Long bno;


    public Long getIhno() {
        return ihno;
    }

    public void setIhno(Long ihno) {
        this.ihno = ihno;
    }

    public Long getBfid() {
        return bfid;
    }

    public void setBfid(Long bfid) {
        this.bfid = bfid;
    }

    public String getBrname() {
        return brname;
    }

    public void setBrname(String brname) {
        this.brname = brname;
    }

    public Long getBcid() {
        return bcid;
    }

    public void setBcid(Long bcid) {
        this.bcid = bcid;
    }

    public Long getDno() {
        return dno;
    }

    public void setDno(Long dno) {
        this.dno = dno;
    }

    public String getDadevice() {
        return dadevice;
    }

    public void setDadevice(String dadevice) {
        this.dadevice = dadevice;
    }

    public Date getItime() {
        return itime;
    }

    public void setItime(Date itime) {
        this.itime = itime;
    }

    public Date getOtime() {
        return otime;
    }

    public void setOtime(Date otime) {
        this.otime = otime;
    }

    public Integer getYchange() {
        return ychange;
    }

    public void setYchange(Integer ychange) {
        this.ychange = ychange;
    }

    public Long getBno() {
        return bno;
    }

    public void setBno(Long bno) {
        this.bno = bno;
    }

}