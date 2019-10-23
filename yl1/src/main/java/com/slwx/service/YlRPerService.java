package com.slwx.service;

import com.slwx.entity.YlRPer;
import java.util.List;

/**
 * (YlRPer)表服务接口
 *
 * @author makejava
 * @since 2019-10-23 16:41:21
 */
public interface YlRPerService {

    /**
     * 通过ID查询单条数据
     *
     * @param jpid 主键
     * @return 实例对象
     */
    YlRPer queryById(Long jpid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlRPer> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylRPer 实例对象
     * @return 实例对象
     */
    YlRPer insert(YlRPer ylRPer);

    /**
     * 修改数据
     *
     * @param ylRPer 实例对象
     * @return 实例对象
     */
    YlRPer update(YlRPer ylRPer);

    /**
     * 通过主键删除数据
     *
     * @param jpid 主键
     * @return 是否成功
     */
    boolean deleteById(Long jpid);

}