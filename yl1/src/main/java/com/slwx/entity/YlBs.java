package com.slwx.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (YlBs)实体类
 *
 * @author makejava
 * @since 2019-10-23 16:41:18
 */
public class YlBs implements Serializable {
    private static final long serialVersionUID = -17087196088467210L;
    
    private Long bid;
    
    private String yname;
    
    private Integer yquantily;
    
    private String yy;
    
    private String bren;
    
    private Date btime;
    
    private Integer bzt;


    public Long getBid() {
        return bid;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }

    public String getYname() {
        return yname;
    }

    public void setYname(String yname) {
        this.yname = yname;
    }

    public Integer getYquantily() {
        return yquantily;
    }

    public void setYquantily(Integer yquantily) {
        this.yquantily = yquantily;
    }

    public String getYy() {
        return yy;
    }

    public void setYy(String yy) {
        this.yy = yy;
    }

    public String getBren() {
        return bren;
    }

    public void setBren(String bren) {
        this.bren = bren;
    }

    public Date getBtime() {
        return btime;
    }

    public void setBtime(Date btime) {
        this.btime = btime;
    }

    public Integer getBzt() {
        return bzt;
    }

    public void setBzt(Integer bzt) {
        this.bzt = bzt;
    }

}