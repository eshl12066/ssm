package com.slwx.service;

import java.util.List;

/**
 * (YlZybr)表服务接口
 *
 * @author makejava
 * @since 2019-10-24 16:21:21
 */
public interface YlZybrService {

    /**
     * 通过ID查询单条数据
     *
     * @param ihno 主键
     * @return 实例对象
     */
    YlZybr queryById(Long ihno);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlZybr> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylZybr 实例对象
     * @return 实例对象
     */
    YlZybr insert(YlZybr ylZybr);

    /**
     * 修改数据
     *
     * @param ylZybr 实例对象
     * @return 实例对象
     */
    YlZybr update(YlZybr ylZybr);

    /**
     * 通过主键删除数据
     *
     * @param ihno 主键
     * @return 是否成功
     */
    boolean deleteById(Long ihno);

}