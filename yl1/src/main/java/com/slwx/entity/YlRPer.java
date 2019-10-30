package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlRPer)实体类
 *
 * @author makejava
 * @since 2019-10-29 21:48:28
 */
public class YlRPer implements Serializable {
    private static final long serialVersionUID = 771741949801012849L;
    
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