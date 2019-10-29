package com.slwx.service;

import java.util.List;

/**
 * (YlMrqd)表服务接口
 *
 * @author makejava
 * @since 2019-10-24 16:21:11
 */
public interface YlMrqdService {

    /**
     * 通过ID查询单条数据
     *
     * @param mrqdid 主键
     * @return 实例对象
     */
    YlMrqd queryById(Long mrqdid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlMrqd> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylMrqd 实例对象
     * @return 实例对象
     */
    YlMrqd insert(YlMrqd ylMrqd);

    /**
     * 修改数据
     *
     * @param ylMrqd 实例对象
     * @return 实例对象
     */
    YlMrqd update(YlMrqd ylMrqd);

    /**
     * 通过主键删除数据
     *
     * @param mrqdid 主键
     * @return 是否成功
     */
    boolean deleteById(Long mrqdid);

}