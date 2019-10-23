package com.slwx.service;

import com.slwx.entity.YlZy;
import java.util.List;

/**
 * (YlZy)表服务接口
 *
 * @author makejava
 * @since 2019-10-23 16:41:23
 */
public interface YlZyService {

    /**
     * 通过ID查询单条数据
     *
     * @param zyid 主键
     * @return 实例对象
     */
    YlZy queryById(Long zyid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlZy> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylZy 实例对象
     * @return 实例对象
     */
    YlZy insert(YlZy ylZy);

    /**
     * 修改数据
     *
     * @param ylZy 实例对象
     * @return 实例对象
     */
    YlZy update(YlZy ylZy);

    /**
     * 通过主键删除数据
     *
     * @param zyid 主键
     * @return 是否成功
     */
    boolean deleteById(Long zyid);

}