package com.slwx.controller;

import com.slwx.entity.YlBxlx;
import com.slwx.service.YlBxlxService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlBxlx)表控制层
 *
 * @author makejava
 * @since 2019-10-24 16:21:11
 */
@RestController
@RequestMapping("ylBxlx")
public class YlBxlxController {
    /**
     * 服务对象
     */
    @Resource
    private YlBxlxService ylBxlxService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlBxlx selectOne(Long id) {
        return this.ylBxlxService.queryById(id);
    }

}