package com.slwx.controller;

import com.slwx.entity.YlBf;
import com.slwx.service.YlBfService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlBf)表控制层
 *
 * @author makejava
 * @since 2019-10-23 16:41:17
 */
@RestController
@RequestMapping("ylBf")
public class YlBfController {
    /**
     * 服务对象
     */
    @Resource
    private YlBfService ylBfService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlBf selectOne(Long id) {
        return this.ylBfService.queryById(id);
    }

}