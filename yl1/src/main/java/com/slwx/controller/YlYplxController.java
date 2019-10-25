package com.slwx.controller;

import com.slwx.entity.YlYplx;
import com.slwx.service.YlYplxService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlYplx)表控制层
 *
 * @author makejava
 * @since 2019-10-24 16:21:17
 */
@RestController
@RequestMapping("ylYplx")
public class YlYplxController {
    /**
     * 服务对象
     */
    @Resource
    private YlYplxService ylYplxService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlYplx selectOne(Long id) {
        return this.ylYplxService.queryById(id);
    }

}