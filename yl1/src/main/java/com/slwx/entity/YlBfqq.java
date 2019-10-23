package com.slwx.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (YlBfqq)实体类
 *
 * @author makejava
 * @since 2019-10-23 16:41:17
 */
public class YlBfqq implements Serializable {
    private static final long serialVersionUID = 820515382627807582L;
    
    private Long qid;
    
    private String yname;
    
    private Integer yquantily;
    
    private String qqd;
    
    private Date qtime;
    
    private String qnr;
    
    private Integer qzt;


    public Long getQid() {
        return qid;
    }

    public void setQid(Long qid) {
        this.qid = qid;
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

    public String getQqd() {
        return qqd;
    }

    public void setQqd(String qqd) {
        this.qqd = qqd;
    }

    public Date getQtime() {
        return qtime;
    }

    public void setQtime(Date qtime) {
        this.qtime = qtime;
    }

    public String getQnr() {
        return qnr;
    }

    public void setQnr(String qnr) {
        this.qnr = qnr;
    }

    public Integer getQzt() {
        return qzt;
    }

    public void setQzt(Integer qzt) {
        this.qzt = qzt;
    }

}