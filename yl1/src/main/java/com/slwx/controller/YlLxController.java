package com.slwx.controller;

import com.slwx.entity.YlLx;
import com.slwx.service.YlLxService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlLx)表控制层
 *
 * @author makejava
 * @since 2019-10-24 16:21:11
 */
@RestController
@RequestMapping("ylLx")
public class YlLxController {
    /**
     * 服务对象
     */
    @Resource
    private YlLxService ylLxService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlLx selectOne(Long id) {
        return this.ylLxService.queryById(id);
    }

}