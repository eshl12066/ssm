package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlBr)实体类
 *
 * @author makejava
 * @since 2019-10-29 21:48:27
 */
public class YlBr implements Serializable {
    private static final long serialVersionUID = 151118818919700913L;
    
    private Long pno;
    
    private String pname;
    
    private String psex;
    
    private Integer page;


    public Long getPno() {
        return pno;
    }

    public void setPno(Long pno) {
        this.pno = pno;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPsex() {
        return psex;
    }

    public void setPsex(String psex) {
        this.psex = psex;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

}