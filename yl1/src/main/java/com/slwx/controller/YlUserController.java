package com.slwx.controller;

import com.slwx.entity.YlUser;
import com.slwx.service.YlUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlUser)表控制层
 *
 * @author makejava
 * @since 2019-10-24 16:21:12
 */
@RestController
@RequestMapping("ylUser")
public class YlUserController {
    /**
     * 服务对象
     */
    @Resource
    private YlUserService ylUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlUser selectOne(Long id) {
        return this.ylUserService.queryById(id);
    }

    @GetMapping("login")
    @ResponseBody
    public int login(YlUser ylUser) {
        System.out.println("你吗的用户："+ylUser.getName());
        return this.ylUserService.login(ylUser);
    }
}