package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlBf)实体类
 *
 * @author makejava
 * @since 2019-10-23 16:41:17
 */
public class YlBf implements Serializable {
    private static final long serialVersionUID = -85239612428443059L;
    
    private Long bfid;
    
    private String bfname;


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