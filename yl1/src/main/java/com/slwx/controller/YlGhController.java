package com.slwx.controller;

import com.slwx.entity.YlGh;
import com.slwx.service.YlGhService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlGh)表控制层
 *
 * @author makejava
 * @since 2019-10-23 16:41:18
 */
@RestController
@RequestMapping("ylGh")
public class YlGhController {
    /**
     * 服务对象
     */
    @Resource
    private YlGhService ylGhService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlGh selectOne(Long id) {
        return this.ylGhService.queryById(id);
    }

}