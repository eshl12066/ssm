package com.slwx.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (YlBs)实体类
 *
 * @author makejava
 * @since 2019-10-29 21:48:27
 */
public class YlBs implements Serializable {
    private static final long serialVersionUID = -11194783291886224L;
    
    private Long bid;
    
    private String yname;
    
    private Integer yquantily;
    
    private String yy;
    
    private String bren;
    
    private String btime;
    
    private Integer bzt;

    public String getBtime() {
        return btime;
    }

    public void setBtime(String btime) {
        this.btime = btime;
    }

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

    public Integer getBzt() {
        return bzt;
    }

    public void setBzt(Integer bzt) {
        this.bzt = bzt;
    }

}