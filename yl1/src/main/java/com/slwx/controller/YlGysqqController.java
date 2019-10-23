package com.slwx.controller;

import com.slwx.entity.YlGysqq;
import com.slwx.service.YlGysqqService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlGysqq)表控制层
 *
 * @author makejava
 * @since 2019-10-23 16:41:21
 */
@RestController
@RequestMapping("ylGysqq")
public class YlGysqqController {
    /**
     * 服务对象
     */
    @Resource
    private YlGysqqService ylGysqqService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlGysqq selectOne(Long id) {
        return this.ylGysqqService.queryById(id);
    }

}