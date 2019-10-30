package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlBm)实体类
 *
 * @author makejava
 * @since 2019-10-29 21:48:27
 */
public class YlBm implements Serializable {
    private static final long serialVersionUID = -60450877843402432L;
    
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