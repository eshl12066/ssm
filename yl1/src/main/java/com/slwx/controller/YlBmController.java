package com.slwx.controller;

import com.slwx.entity.YlBm;
import com.slwx.service.YlBmService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlBm)表控制层
 *
 * @author makejava
 * @since 2019-10-24 16:21:10
 */
@RestController
@RequestMapping("ylBm")
public class YlBmController {
    /**
     * 服务对象
     */
    @Resource
    private YlBmService ylBmService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlBm selectOne(Long id) {
        return this.ylBmService.queryById(id);
    }

}