package com.slwx.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (YlGysqq)实体类
 *
 * @author makejava
 * @since 2019-10-29 21:48:27
 */
public class YlGysqq implements Serializable {
    private static final long serialVersionUID = -92137599171596300L;
    
    private Long gid;
    
    private String yname;
    
    private Integer yquantily;
    
    private Long gysid;
    
    private Date gtime;
    
    private Integer gzt;


    public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
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

    public Long getGysid() {
        return gysid;
    }

    public void setGysid(Long gysid) {
        this.gysid = gysid;
    }

    public Date getGtime() {
        return gtime;
    }

    public void setGtime(Date gtime) {
        this.gtime = gtime;
    }

    public Integer getGzt() {
        return gzt;
    }

    public void setGzt(Integer gzt) {
        this.gzt = gzt;
    }

}