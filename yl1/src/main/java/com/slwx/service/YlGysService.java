package com.slwx.service;

import com.slwx.entity.YlGys;
import java.util.List;

/**
 * (YlGys)表服务接口
 *
 * @author makejava
 * @since 2019-10-24 16:21:11
 */
public interface YlGysService {

    /**
     * 通过ID查询单条数据
     *
     * @param gid 主键
     * @return 实例对象
     */
    YlGys queryById(Long gid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlGys> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylGys 实例对象
     * @return 实例对象
     */
    YlGys insert(YlGys ylGys);

    /**
     * 修改数据
     *
     * @param ylGys 实例对象
     * @return 实例对象
     */
    YlGys update(YlGys ylGys);

    /**
     * 通过主键删除数据
     *
     * @param gid 主键
     * @return 是否成功
     */
    boolean deleteById(Long gid);

}