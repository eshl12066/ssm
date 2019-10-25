package com.slwx.service;

import com.slwx.entity.YlZdxx;
import java.util.List;

/**
 * (YlZdxx)表服务接口
 *
 * @author makejava
 * @since 2019-10-24 16:21:21
 */
public interface YlZdxxService {

    /**
     * 通过ID查询单条数据
     *
     * @param rid 主键
     * @return 实例对象
     */
    YlZdxx queryById(Long rid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlZdxx> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylZdxx 实例对象
     * @return 实例对象
     */
    YlZdxx insert(YlZdxx ylZdxx);

    /**
     * 修改数据
     *
     * @param ylZdxx 实例对象
     * @return 实例对象
     */
    YlZdxx update(YlZdxx ylZdxx);

    /**
     * 通过主键删除数据
     *
     * @param rid 主键
     * @return 是否成功
     */
    boolean deleteById(Long rid);

}