package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlURole)实体类
 *
 * @author makejava
 * @since 2019-10-23 16:41:22
 */
public class YlURole implements Serializable {
    private static final long serialVersionUID = 935594351366638602L;
    
    private Long ujid;
    
    private Long uid;
    
    private Long jid;


    public Long getUjid() {
        return ujid;
    }

    public void setUjid(Long ujid) {
        this.ujid = ujid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getJid() {
        return jid;
    }

    public void setJid(Long jid) {
        this.jid = jid;
    }

}