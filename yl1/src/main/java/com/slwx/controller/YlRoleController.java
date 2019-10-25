package com.slwx.controller;

import com.slwx.entity.YlRole;
import com.slwx.service.YlRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlRole)表控制层
 *
 * @author makejava
 * @since 2019-10-24 16:21:12
 */
@RestController
@RequestMapping("ylRole")
public class YlRoleController {
    /**
     * 服务对象
     */
    @Resource
    private YlRoleService ylRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlRole selectOne(Long id) {
        return this.ylRoleService.queryById(id);
    }

}