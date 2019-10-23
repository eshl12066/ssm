package com.slwx.controller;

import com.slwx.entity.YlZy;
import com.slwx.service.YlZyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlZy)表控制层
 *
 * @author makejava
 * @since 2019-10-23 16:41:23
 */
@RestController
@RequestMapping("ylZy")
public class YlZyController {
    /**
     * 服务对象
     */
    @Resource
    private YlZyService ylZyService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlZy selectOne(Long id) {
        return this.ylZyService.queryById(id);
    }

}