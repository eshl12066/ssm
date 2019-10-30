package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlBc)实体类
 *
 * @author makejava
 * @since 2019-10-29 21:48:27
 */
public class YlBc implements Serializable {
    private static final long serialVersionUID = -29228140481116531L;
    
    private Long bcid;
    
    private String bcname;
    
    private Long bfid;
    
    private Integer bfy;
    
    private Integer bczt;


    public Long getBcid() {
        return bcid;
    }

    public void setBcid(Long bcid) {
        this.bcid = bcid;
    }

    public String getBcname() {
        return bcname;
    }

    public void setBcname(String bcname) {
        this.bcname = bcname;
    }

    public Long getBfid() {
        return bfid;
    }

    public void setBfid(Long bfid) {
        this.bfid = bfid;
    }

    public Integer getBfy() {
        return bfy;
    }

    public void setBfy(Integer bfy) {
        this.bfy = bfy;
    }

    public Integer getBczt() {
        return bczt;
    }

    public void setBczt(Integer bczt) {
        this.bczt = bczt;
    }

}