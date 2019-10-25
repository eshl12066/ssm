package com.slwx.controller;

import com.slwx.entity.YlPer;
import com.slwx.service.YlPerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlPer)表控制层
 *
 * @author makejava
 * @since 2019-10-24 16:21:11
 */
@RestController
@RequestMapping("ylPer")
public class YlPerController {
    /**
     * 服务对象
     */
    @Resource
    private YlPerService ylPerService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlPer selectOne(Long id) {
        return this.ylPerService.queryById(id);
    }

}