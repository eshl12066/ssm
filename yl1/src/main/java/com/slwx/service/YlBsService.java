package com.slwx.service;

import com.slwx.entity.YlBs;
import com.slwx.entity.YlGh;
import com.slwx.util.PageBean;

import java.util.List;
import java.util.Map;

/**
 * (YlBs)表服务接口
 *
 * @author makejava
 * @since 2019-10-24 16:21:10
 */
public interface YlBsService {

    /**
     * 通过ID查询单条数据
     *
     * @param bid 主键
     * @return 实例对象
     */
    YlBs queryById(Long bid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlBs> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylBs 实例对象
     * @return 实例对象
     */
    YlBs insert(YlBs ylBs);

    /**
     * 修改数据
     *
     * @param ylBs 实例对象
     * @return 实例对象
     */
    YlBs update(YlBs ylBs);

    /**
     * 通过主键删除数据
     *
     * @param bid 主键
     * @return 是否成功
     */
    boolean deleteById(Long bid);

    //********************GD
    List<Map> selectgetAllPager(YlBs ylBs, PageBean pageBean);

}