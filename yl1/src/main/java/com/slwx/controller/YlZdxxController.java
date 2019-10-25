package com.slwx.controller;

import com.slwx.entity.YlZdxx;
import com.slwx.service.YlZdxxService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlZdxx)表控制层
 *
 * @author makejava
 * @since 2019-10-24 16:21:21
 */
@RestController
@RequestMapping("ylZdxx")
public class YlZdxxController {
    /**
     * 服务对象
     */
    @Resource
    private YlZdxxService ylZdxxService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlZdxx selectOne(Long id) {
        return this.ylZdxxService.queryById(id);
    }

}