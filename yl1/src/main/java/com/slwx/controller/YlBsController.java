package com.slwx.controller;

import com.slwx.entity.YlBs;
import com.slwx.service.YlBsService;
import com.slwx.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (YlBs)表控制层
 *
 * @author makejava
 * @since 2019-10-24 16:21:10
 */
@Controller
@RequestMapping("ylBs")
public class YlBsController {
    /**
     * 服务对象
     */
    @Autowired
    private YlBsService ylBsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlBs selectOne(Long id) {
        return this.ylBsService.queryById(id);
    }

//    @ResponseBody
//    @RequestMapping("/login")
//    public JsonData selectOne(Long id) {
//        JsonData
//        return this.ylBsService.queryById(id);
//    }
}