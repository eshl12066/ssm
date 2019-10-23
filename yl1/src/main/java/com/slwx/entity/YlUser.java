package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlUser)实体类
 *
 * @author makejava
 * @since 2019-10-23 16:41:22
 */
public class YlUser implements Serializable {
    private static final long serialVersionUID = 838333021089807215L;
    
    private Long uid;
    
    private String name;
    
    private String password;
    
    private Long jid;


    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getJid() {
        return jid;
    }

    public void setJid(Long jid) {
        this.jid = jid;
    }

}