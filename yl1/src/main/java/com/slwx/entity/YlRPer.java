package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlRPer)实体类
 *
 * @author makejava
 * @since 2019-10-23 16:41:21
 */
public class YlRPer implements Serializable {
    private static final long serialVersionUID = 602496525552668698L;
    
    private Long jpid;
    
    private Long jid;
    
    private Long perid;


    public Long getJpid() {
        return jpid;
    }

    public void setJpid(Long jpid) {
        this.jpid = jpid;
    }

    public Long getJid() {
        return jid;
    }

    public void setJid(Long jid) {
        this.jid = jid;
    }

    public Long getPerid() {
        return perid;
    }

    public void setPerid(Long perid) {
        this.perid = perid;
    }

}