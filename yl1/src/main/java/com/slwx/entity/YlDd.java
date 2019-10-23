package com.slwx.entity;

import java.io.Serializable;

/**
 * (YlDd)实体类
 *
 * @author makejava
 * @since 2019-10-23 16:41:18
 */
public class YlDd implements Serializable {
    private static final long serialVersionUID = -52400447340348564L;
    
    private Long ydid;
    
    private Long pno;
    
    private Long dno;
    
    private Integer sfjf;
    
    private Integer sfny;


    public Long getYdid() {
        return ydid;
    }

    public void setYdid(Long ydid) {
        this.ydid = ydid;
    }

    public Long getPno() {
        return pno;
    }

    public void setPno(Long pno) {
        this.pno = pno;
    }

    public Long getDno() {
        return dno;
    }

    public void setDno(Long dno) {
        this.dno = dno;
    }

    public Integer getSfjf() {
        return sfjf;
    }

    public void setSfjf(Integer sfjf) {
        this.sfjf = sfjf;
    }

    public Integer getSfny() {
        return sfny;
    }

    public void setSfny(Integer sfny) {
        this.sfny = sfny;
    }

}