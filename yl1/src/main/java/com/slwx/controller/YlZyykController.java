package com.slwx.controller;

import com.slwx.entity.YlZyyk;
import com.slwx.service.YlZyykService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlZyyk)表控制层
 *
 * @author makejava
 * @since 2019-10-24 16:21:21
 */
@RestController
@RequestMapping("ylZyyk")
public class YlZyykController {
    /**
     * 服务对象
     */
    @Resource
    private YlZyykService ylZyykService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlZyyk selectOne(Long id) {
        return this.ylZyykService.queryById(id);
    }

}