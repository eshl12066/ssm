package com.slwx.controller;

import com.slwx.entity.YlGh;
import com.slwx.service.YlGhService;
import com.slwx.util.JsonData;
import com.slwx.util.PageBean;
import com.slwx.util.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.print.PrinterException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (YlGh)表控制层
 *
 * @author makejava
 * @since 2019-10-24 16:21:11
 */
@Controller
@RequestMapping("/ylGh")
public class YlGhController {
    /**
     * 服务对象
     */
    @Autowired
    private YlGhService ylGhService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public YlGh selectOne(Long id) {
        return this.ylGhService.queryById(id);
    }


    @ResponseBody
    @RequestMapping("/insert")
    public JsonData insert(YlGh ylGh, HttpServletRequest request) {
        ylGh.setPid(12l);
        ylGh.setSname("aa");
        ylGh.setDno(1213l);
        int insert = this.ylGhService.insert(ylGh);
        JsonData jsonData = new JsonData(1, "创建成功", insert);
        return jsonData;
    }


    @ResponseBody
    @RequestMapping("/getall")
    public JsonData getAll(YlGh ylGh, HttpServletRequest request) {
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);
        JsonData jsonData = null;
        Long rno = ylGh.getRno();
        List<Map> list = ylGhService.selectgetAllPager(ylGh, pageBean);
        jsonData = new JsonData(1, "操作成功", list);
        jsonData.put("pageBean", pageBean);
        System.out.println(jsonData.toString());
        return jsonData;
        //jijoijojo-
    }


}