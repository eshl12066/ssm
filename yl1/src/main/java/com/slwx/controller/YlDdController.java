package com.slwx.controller;

import com.slwx.entity.YlDd;
import com.slwx.service.YlDdService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlDd)表控制层
 *
 * @author makejava
 * @since 2019-10-24 16:21:11
 */
@RestController
@RequestMapping("ylDd")
public class YlDdController {
    /**
     * 服务对象
     */
    @Resource
    private YlDdService ylDdService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlDd selectOne(Long id) {
        return this.ylDdService.queryById(id);
    }

}