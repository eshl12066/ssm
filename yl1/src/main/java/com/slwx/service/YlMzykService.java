package com.slwx.service;

import com.slwx.entity.YlMzyk;
import java.util.List;

/**
 * (YlMzyk)表服务接口
 *
 * @author makejava
 * @since 2019-10-23 16:41:21
 */
public interface YlMzykService {

    /**
     * 通过ID查询单条数据
     *
     * @param myno 主键
     * @return 实例对象
     */
    YlMzyk queryById(Long myno);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlMzyk> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylMzyk 实例对象
     * @return 实例对象
     */
    YlMzyk insert(YlMzyk ylMzyk);

    /**
     * 修改数据
     *
     * @param ylMzyk 实例对象
     * @return 实例对象
     */
    YlMzyk update(YlMzyk ylMzyk);

    /**
     * 通过主键删除数据
     *
     * @param myno 主键
     * @return 是否成功
     */
    boolean deleteById(Long myno);

}