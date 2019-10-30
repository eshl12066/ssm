package com.slwx.controller;

import com.slwx.entity.YlZybr;
import com.slwx.service.YlZybrService;
import com.slwx.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * (YlZybr)表控制层
 *
 * @author makejava
 * @since 2019-10-24 16:21:21
 */
@Controller
@RequestMapping("ylZybr")
public class YlZybrController {
    /**
     * 服务对象
     */
    @Autowired
    private YlZybrService ylZybrService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YlZybr selectOne(Long id) {
        return this.ylZybrService.queryById(id);
    }
    @ResponseBody
    @RequestMapping("addYlZybr")
    public JsonData add(YlZybr ylZybr, HttpServletRequest req) {
        String iTime = req.getParameter("ITime");
        System.out.println(iTime);
        ylZybr.setItime(iTime);
        int insert = this.ylZybrService.insert(ylZybr);
        JsonData JsonData = new JsonData(1,"添加成功",insert);
        return  JsonData;
    }

}