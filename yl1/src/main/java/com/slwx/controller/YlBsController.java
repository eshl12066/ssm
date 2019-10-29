package com.slwx.controller;

import com.slwx.entity.YlBs;
import com.slwx.entity.YlGh;
import com.slwx.service.YlBsService;
import com.slwx.util.JsonData;
import com.slwx.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

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

    @ResponseBody
    @RequestMapping("/getall")
    public JsonData getAll(YlBs ylBs, HttpServletRequest request) {
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);
        JsonData jsonData = null;
        Long rno = ylBs.getBid();
        List<Map> list = ylBsService.selectgetAllPager(ylBs, pageBean);
        jsonData = new JsonData(1, "操作成功", list);
        jsonData.put("pageBean", pageBean);
        System.out.println(jsonData.toString());
        return jsonData;
        //jijoijojo-
    }
}