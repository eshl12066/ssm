package com.slwx.controller;

import com.slwx.entity.YlGys;
import com.slwx.service.YlGysService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlGys)表控制层
 *
 * @author makejava
 * @since 2019-10-23 16:41:18
 */
@RestController
@RequestMapping("ylGys")
public class YlGysController {
    /**
     * 服务对象
     */
    @Resource
    private YlGysService ylGysService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlGys selectOne(Long id) {
        return this.ylGysService.queryById(id);
    }

}