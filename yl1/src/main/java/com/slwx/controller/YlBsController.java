package com.slwx.controller;

import com.slwx.entity.YlBs;
import com.slwx.service.YlBsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlBs)表控制层
 *
 * @author makejava
 * @since 2019-10-24 16:21:10
 */
@RestController
@RequestMapping("ylBs")
public class YlBsController {
    /**
     * 服务对象
     */
    @Resource
    private YlBsService ylBsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlBs selectOne(Long id) {
        return this.ylBsService.queryById(id);
    }

}