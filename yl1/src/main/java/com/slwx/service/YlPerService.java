package com.slwx.service;

import com.slwx.entity.YlPer;
import java.util.List;

/**
 * (YlPer)表服务接口
 *
 * @author makejava
 * @since 2019-10-24 16:21:11
 */
public interface YlPerService {

    /**
     * 通过ID查询单条数据
     *
     * @param perid 主键
     * @return 实例对象
     */
    YlPer queryById(Long perid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlPer> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylPer 实例对象
     * @return 实例对象
     */
    YlPer insert(YlPer ylPer);

    /**
     * 修改数据
     *
     * @param ylPer 实例对象
     * @return 实例对象
     */
    YlPer update(YlPer ylPer);

    /**
     * 通过主键删除数据
     *
     * @param perid 主键
     * @return 是否成功
     */
    boolean deleteById(Long perid);

}