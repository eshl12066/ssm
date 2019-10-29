package com.slwx.entity.vo;

import com.slwx.entity.YlUser;

/**
 * @author 狗蛋
 * @create 2019-10-29-8:49
 */
public class YlUserVo extends YlUser {
    private String salt;

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}
