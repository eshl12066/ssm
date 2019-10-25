package com.slwx.controller;

import com.slwx.entity.YlURole;
import com.slwx.service.YlURoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlURole)表控制层
 *
 * @author makejava
 * @since 2019-10-24 16:21:12
 */
@RestController
@RequestMapping("ylURole")
public class YlURoleController {
    /**
     * 服务对象
     */
    @Resource
    private YlURoleService ylURoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlURole selectOne(Long id) {
        return this.ylURoleService.queryById(id);
    }

}