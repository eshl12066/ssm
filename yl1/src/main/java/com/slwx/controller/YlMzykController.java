package com.slwx.controller;

import com.slwx.entity.YlMzyk;
import com.slwx.service.YlMzykService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlMzyk)表控制层
 *
 * @author makejava
 * @since 2019-10-24 16:21:11
 */
@RestController
@RequestMapping("ylMzyk")
public class YlMzykController {
    /**
     * 服务对象
     */
    @Resource
    private YlMzykService ylMzykService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlMzyk selectOne(Long id) {
        return this.ylMzykService.queryById(id);
    }

}