package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlPer)实体类
 *
 * @author makejava
 * @since 2019-10-23 16:41:21
 */
public class YlPer implements Serializable {
    private static final long serialVersionUID = -92904913472366352L;
    
    private Long perid;
    
    private String pername;
    
    private String url;


    public Long getPerid() {
        return perid;
    }

    public void setPerid(Long perid) {
        this.perid = perid;
    }

    public String getPername() {
        return pername;
    }

    public void setPername(String pername) {
        this.pername = pername;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}