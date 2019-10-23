package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlBflx)实体类
 *
 * @author makejava
 * @since 2019-10-23 16:41:17
 */
public class YlBflx implements Serializable {
    private static final long serialVersionUID = 125807461280439499L;
    
    private Long bflxid;
    
    private String bflxname;


    public Long getBflxid() {
        return bflxid;
    }

    public void setBflxid(Long bflxid) {
        this.bflxid = bflxid;
    }

    public String getBflxname() {
        return bflxname;
    }

    public void setBflxname(String bflxname) {
        this.bflxname = bflxname;
    }

}