package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlGys)实体类
 *
 * @author makejava
 * @since 2019-10-29 21:48:27
 */
public class YlGys implements Serializable {
    private static final long serialVersionUID = 116420316473599874L;
    
    private Long gid;
    
    private String gname;
    
    private String gman;
    
    private String gaddress;


    public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGman() {
        return gman;
    }

    public void setGman(String gman) {
        this.gman = gman;
    }

    public String getGaddress() {
        return gaddress;
    }

    public void setGaddress(String gaddress) {
        this.gaddress = gaddress;
    }

}