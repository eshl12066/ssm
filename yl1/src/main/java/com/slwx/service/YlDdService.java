package com.slwx.service;

import com.slwx.entity.YlDd;
import java.util.List;

/**
 * (YlDd)表服务接口
 *
 * @author makejava
 * @since 2019-10-23 16:41:18
 */
public interface YlDdService {

    /**
     * 通过ID查询单条数据
     *
     * @param ydid 主键
     * @return 实例对象
     */
    YlDd queryById(Long ydid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlDd> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylDd 实例对象
     * @return 实例对象
     */
    YlDd insert(YlDd ylDd);

    /**
     * 修改数据
     *
     * @param ylDd 实例对象
     * @return 实例对象
     */
    YlDd update(YlDd ylDd);

    /**
     * 通过主键删除数据
     *
     * @param ydid 主键
     * @return 是否成功
     */
    boolean deleteById(Long ydid);

}