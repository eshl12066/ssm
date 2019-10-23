package com.slwx.controller;

import com.slwx.entity.YlKs;
import com.slwx.service.YlKsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlKs)表控制层
 *
 * @author makejava
 * @since 2019-10-23 16:41:21
 */
@RestController
@RequestMapping("ylKs")
public class YlKsController {
    /**
     * 服务对象
     */
    @Resource
    private YlKsService ylKsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlKs selectOne(Long id) {
        return this.ylKsService.queryById(id);
    }

}