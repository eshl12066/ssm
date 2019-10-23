package com.slwx.controller;

import com.slwx.entity.YlRPer;
import com.slwx.service.YlRPerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlRPer)表控制层
 *
 * @author makejava
 * @since 2019-10-23 16:41:21
 */
@RestController
@RequestMapping("ylRPer")
public class YlRPerController {
    /**
     * 服务对象
     */
    @Resource
    private YlRPerService ylRPerService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlRPer selectOne(Long id) {
        return this.ylRPerService.queryById(id);
    }

}