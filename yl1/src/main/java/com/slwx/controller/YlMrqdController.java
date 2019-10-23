package com.slwx.controller;

import com.slwx.entity.YlMrqd;
import com.slwx.service.YlMrqdService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlMrqd)表控制层
 *
 * @author makejava
 * @since 2019-10-23 16:41:21
 */
@RestController
@RequestMapping("ylMrqd")
public class YlMrqdController {
    /**
     * 服务对象
     */
    @Resource
    private YlMrqdService ylMrqdService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlMrqd selectOne(Long id) {
        return this.ylMrqdService.queryById(id);
    }

}