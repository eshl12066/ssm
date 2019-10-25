package com.slwx.controller;

import com.slwx.entity.YlSs;
import com.slwx.service.YlSsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlSs)表控制层
 *
 * @author makejava
 * @since 2019-10-24 16:21:12
 */
@RestController
@RequestMapping("ylSs")
public class YlSsController {
    /**
     * 服务对象
     */
    @Resource
    private YlSsService ylSsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlSs selectOne(Long id) {
        return this.ylSsService.queryById(id);
    }

}