package com.slwx.controller;

import com.slwx.entity.YlDdx;
import com.slwx.service.YlDdxService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlDdx)表控制层
 *
 * @author makejava
 * @since 2019-10-24 16:21:11
 */
@RestController
@RequestMapping("ylDdx")
public class YlDdxController {
    /**
     * 服务对象
     */
    @Resource
    private YlDdxService ylDdxService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlDdx selectOne(Long id) {
        return this.ylDdxService.queryById(id);
    }

}