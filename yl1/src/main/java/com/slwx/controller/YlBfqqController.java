package com.slwx.controller;

import com.slwx.entity.YlBfqq;
import com.slwx.service.YlBfqqService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlBfqq)表控制层
 *
 * @author makejava
 * @since 2019-10-24 16:21:10
 */
@RestController
@RequestMapping("ylBfqq")
public class YlBfqqController {
    /**
     * 服务对象
     */
    @Resource
    private YlBfqqService ylBfqqService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlBfqq selectOne(Long id) {
        return this.ylBfqqService.queryById(id);
    }

}