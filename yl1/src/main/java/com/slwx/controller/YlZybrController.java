package com.slwx.controller;

import com.slwx.entity.YlZybr;
import com.slwx.service.YlZybrService;
import com.slwx.util.JsonData;
import com.slwx.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

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

    @ResponseBody
    @RequestMapping("/list")
    public JsonData getAllPager(YlZybr ylZybr, HttpServletRequest request) {
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);
        JsonData jsonData = null;
        List<Map> list = this.ylZybrService.listPager(ylZybr,pageBean);
        jsonData = new JsonData(1, "操作成功", list);
        jsonData.put("pageBean", pageBean);
//        System.out.println(jsonData.toString());
        return jsonData;
    }

    @ResponseBody
    @RequestMapping("/editYlZybr")
    public JsonData editYlZybr(YlZybr ylZybr, HttpServletRequest request) {
        JsonData jsonData = null;
        YlZybr update = this.ylZybrService.update(ylZybr);
        jsonData = new JsonData(1, "修改成功", update);
        return jsonData;
    }

    @ResponseBody
    @RequestMapping("/deleteById")
    public JsonData deleteById(YlZybr ylZybr, HttpServletRequest request) {
        JsonData jsonData = null;
        boolean b = this.ylZybrService.deleteById(ylZybr.getIhno());
        jsonData = new JsonData(1, "删除成功", b);
        return jsonData;
    }
}