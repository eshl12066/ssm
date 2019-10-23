package com.slwx.controller;

import com.slwx.entity.YlBr;
import com.slwx.service.YlBrService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlBr)表控制层
 *
 * @author makejava
 * @since 2019-10-23 16:41:18
 */
@RestController
@RequestMapping("ylBr")
public class YlBrController {
    /**
     * 服务对象
     */
    @Resource
    private YlBrService ylBrService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlBr selectOne(Long id) {
        return this.ylBrService.queryById(id);
    }

}