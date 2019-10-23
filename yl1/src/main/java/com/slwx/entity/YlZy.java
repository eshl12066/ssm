package com.slwx.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (YlZy)实体类
 *
 * @author makejava
 * @since 2019-10-23 16:41:23
 */
public class YlZy implements Serializable {
    private static final long serialVersionUID = 299326018142743291L;
    
    private Long zyid;
    
    private Long ihno;
    
    private String zyd;
    
    private String zdjg;
    
    private Long zdks;
    
    private Date zytime;
    
    private String zyyy;


    public Long getZyid() {
        return zyid;
    }

    public void setZyid(Long zyid) {
        this.zyid = zyid;
    }

    public Long getIhno() {
        return ihno;
    }

    public void setIhno(Long ihno) {
        this.ihno = ihno;
    }

    public String getZyd() {
        return zyd;
    }

    public void setZyd(String zyd) {
        this.zyd = zyd;
    }

    public String getZdjg() {
        return zdjg;
    }

    public void setZdjg(String zdjg) {
        this.zdjg = zdjg;
    }

    public Long getZdks() {
        return zdks;
    }

    public void setZdks(Long zdks) {
        this.zdks = zdks;
    }

    public Date getZytime() {
        return zytime;
    }

    public void setZytime(Date zytime) {
        this.zytime = zytime;
    }

    public String getZyyy() {
        return zyyy;
    }

    public void setZyyy(String zyyy) {
        this.zyyy = zyyy;
    }

}