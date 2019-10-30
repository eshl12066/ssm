package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlBf)实体类
 *
 * @author makejava
 * @since 2019-10-29 21:48:27
 */
public class YlBf implements Serializable {
    private static final long serialVersionUID = 315144741401664655L;
    
    private Long bfid;
    
    private String bfname;

    private Long bflxid;

    public Long getBflxid() {
        return bflxid;
    }

    public void setBflxid(Long bflxid) {
        this.bflxid = bflxid;
    }

    public Long getBfid() {
        return bfid;
    }

    public void setBfid(Long bfid) {
        this.bfid = bfid;
    }

    public String getBfname() {
        return bfname;
    }

    public void setBfname(String bfname) {
        this.bfname = bfname;
    }

}