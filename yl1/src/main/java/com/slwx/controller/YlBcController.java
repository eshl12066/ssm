package com.slwx.controller;

import com.slwx.entity.YlBc;
import com.slwx.service.YlBcService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlBc)表控制层
 *
 * @author makejava
 * @since 2019-10-23 16:41:17
 */
@RestController
@RequestMapping("ylBc")
public class YlBcController {
    /**
     * 服务对象
     */
    @Resource
    private YlBcService ylBcService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlBc selectOne(Long id) {
        return this.ylBcService.queryById(id);
    }

}