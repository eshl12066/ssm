package com.slwx.controller;

import com.slwx.entity.YlZybr;
import com.slwx.service.YlZybrService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlZybr)表控制层
 *
 * @author makejava
 * @since 2019-10-23 16:41:23
 */
@RestController
@RequestMapping("ylZybr")
public class YlZybrController {
    /**
     * 服务对象
     */
    @Resource
    private YlZybrService ylZybrService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlZybr selectOne(Long id) {
        return this.ylZybrService.queryById(id);
    }

}