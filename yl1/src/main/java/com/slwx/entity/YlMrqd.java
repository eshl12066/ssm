package com.slwx.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (YlMrqd)实体类
 *
 * @author makejava
 * @since 2019-10-23 16:41:21
 */
public class YlMrqd implements Serializable {
    private static final long serialVersionUID = -42785873564431511L;
    
    private Long mrqdid;
    
    private Long ihno;
    
    private Long dno;
    
    private String yname;
    
    private Integer yshul;
    
    private Object yzj;
    
    private Date mtime;


    public Long getMrqdid() {
        return mrqdid;
    }

    public void setMrqdid(Long mrqdid) {
        this.mrqdid = mrqdid;
    }

    public Long getIhno() {
        return ihno;
    }

    public void setIhno(Long ihno) {
        this.ihno = ihno;
    }

    public Long getDno() {
        return dno;
    }

    public void setDno(Long dno) {
        this.dno = dno;
    }

    public String getYname() {
        return yname;
    }

    public void setYname(String yname) {
        this.yname = yname;
    }

    public Integer getYshul() {
        return yshul;
    }

    public void setYshul(Integer yshul) {
        this.yshul = yshul;
    }

    public Object getYzj() {
        return yzj;
    }

    public void setYzj(Object yzj) {
        this.yzj = yzj;
    }

    public Date getMtime() {
        return mtime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

}