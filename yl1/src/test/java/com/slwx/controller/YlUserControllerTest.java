package com.slwx.controller;

import com.slwx.entity.YlUser;
import com.slwx.entity.YlZyyk;
import com.slwx.service.YlBcService;
import com.slwx.service.YlUserService;
import com.slwx.service.YlZyykService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author 狗蛋
 * @create 2019-10-27-16:41
 */
public class YlUserControllerTest extends BaseTestCase {

    @Autowired
    private YlUserService ylUserService;
//
    @Autowired
    private YlZyykService ylZyykService;
    @Test
    public void selectOne() {
    }

    @org.junit.Test
    public void login() {
        System.out.println(ylUserService.queryById((long)1));
    }
}