package com.slwx.controller;

import com.slwx.entity.YlBflx;
import com.slwx.service.YlBflxService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlBflx)表控制层
 *
 * @author makejava
 * @since 2019-10-23 16:41:17
 */
@RestController
@RequestMapping("ylBflx")
public class YlBflxController {
    /**
     * 服务对象
     */
    @Resource
    private YlBflxService ylBflxService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlBflx selectOne(Long id) {
        return this.ylBflxService.queryById(id);
    }

}