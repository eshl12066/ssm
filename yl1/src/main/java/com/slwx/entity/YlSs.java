package com.slwx.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (YlSs)实体类
 *
 * @author makejava
 * @since 2019-10-29 21:48:28
 */
public class YlSs implements Serializable {
    private static final long serialVersionUID = -47069341962726671L;
    
    private Long ssid;
    
    private Long ihno;
    
    private String ssname;
    
    private Long dno;
    
    private String mtime;
    
    private Integer ssmoney;
    
    private Integer sszt;

    public String getMtime() {
        return mtime;
    }

    public void setMtime(String mtime) {
        this.mtime = mtime;
    }

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