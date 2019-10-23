package com.slwx.service;

import com.slwx.entity.YlZxyk;
import java.util.List;

/**
 * (YlZxyk)表服务接口
 *
 * @author makejava
 * @since 2019-10-23 16:41:22
 */
public interface YlZxykService {

    /**
     * 通过ID查询单条数据
     *
     * @param yno 主键
     * @return 实例对象
     */
    YlZxyk queryById(Long yno);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlZxyk> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylZxyk 实例对象
     * @return 实例对象
     */
    YlZxyk insert(YlZxyk ylZxyk);

    /**
     * 修改数据
     *
     * @param ylZxyk 实例对象
     * @return 实例对象
     */
    YlZxyk update(YlZxyk ylZxyk);

    /**
     * 通过主键删除数据
     *
     * @param yno 主键
     * @return 是否成功
     */
    boolean deleteById(Long yno);

}