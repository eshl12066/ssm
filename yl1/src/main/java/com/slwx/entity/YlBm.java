package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlBm)实体类
 *
 * @author makejava
 * @since 2019-10-23 16:41:17
 */
public class YlBm implements Serializable {
    private static final long serialVersionUID = 447309496368203544L;
    
    private Long bmid;
    
    private String bmname;


    public Long getBmid() {
        return bmid;
    }

    public void setBmid(Long bmid) {
        this.bmid = bmid;
    }

    public String getBmname() {
        return bmname;
    }

    public void setBmname(String bmname) {
        this.bmname = bmname;
    }

}