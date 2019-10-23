package com.slwx.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (YlSs)实体类
 *
 * @author makejava
 * @since 2019-10-23 16:41:21
 */
public class YlSs implements Serializable {
    private static final long serialVersionUID = -27150756986872366L;
    
    private Long ssid;
    
    private Long ihno;
    
    private String ssname;
    
    private Long dno;
    
    private Date mtime;
    
    private Integer ssmoney;
    
    private Integer sszt;


    public Long getSsid() {
        return ssid;
    }

    public void setSsid(Long ssid) {
        this.ssid = ssid;
    }

    public Long getIhno() {
        return ihno;
    }

    public void setIhno(Long ihno) {
        this.ihno = ihno;
    }

    public String getSsname() {
        return ssname;
    }

    public void setSsname(String ssname) {
        this.ssname = ssname;
    }

    public Long getDno() {
        return dno;
    }

    public void setDno(Long dno) {
        this.dno = dno;
    }

    public Date getMtime() {
        return mtime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    public Integer getSsmoney() {
        return ssmoney;
    }

    public void setSsmoney(Integer ssmoney) {
        this.ssmoney = ssmoney;
    }

    public Integer getSszt() {
        return sszt;
    }

    public void setSszt(Integer sszt) {
        this.sszt = sszt;
    }

}