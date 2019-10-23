package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlRole)实体类
 *
 * @author makejava
 * @since 2019-10-23 16:41:21
 */
public class YlRole implements Serializable {
    private static final long serialVersionUID = 109349884142905993L;
    
    private Long jid;
    
    private String jname;


    public Long getJid() {
        return jid;
    }

    public void setJid(Long jid) {
        this.jid = jid;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

}