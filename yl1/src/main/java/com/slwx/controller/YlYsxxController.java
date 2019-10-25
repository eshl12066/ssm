package com.slwx.controller;

import com.slwx.entity.YlYsxx;
import com.slwx.service.YlYsxxService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlYsxx)表控制层
 *
 * @author makejava
 * @since 2019-10-24 16:21:21
 */
@RestController
@RequestMapping("ylYsxx")
public class YlYsxxController {
    /**
     * 服务对象
     */
    @Resource
    private YlYsxxService ylYsxxService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlYsxx selectOne(Long id) {
        return this.ylYsxxService.queryById(id);
    }

}