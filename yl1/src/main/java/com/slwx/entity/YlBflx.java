package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlBflx)实体类
 *
 * @author makejava
 * @since 2019-10-29 21:48:27
 */
public class YlBflx implements Serializable {
    private static final long serialVersionUID = 646839616604406451L;
    
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