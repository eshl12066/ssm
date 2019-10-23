package com.slwx.controller;

import com.slwx.entity.YlZxyk;
import com.slwx.service.YlZxykService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlZxyk)表控制层
 *
 * @author makejava
 * @since 2019-10-23 16:41:23
 */
@RestController
@RequestMapping("ylZxyk")
public class YlZxykController {
    /**
     * 服务对象
     */
    @Resource
    private YlZxykService ylZxykService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlZxyk selectOne(Long id) {
        return this.ylZxykService.queryById(id);
    }

}