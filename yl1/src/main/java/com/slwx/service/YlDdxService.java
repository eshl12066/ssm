package com.slwx.service;

import com.slwx.entity.YlDdx;
import java.util.List;

/**
 * (YlDdx)表服务接口
 *
 * @author makejava
 * @since 2019-10-23 16:41:18
 */
public interface YlDdxService {

    /**
     * 通过ID查询单条数据
     *
     * @param yddxid 主键
     * @return 实例对象
     */
    YlDdx queryById(Long yddxid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlDdx> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylDdx 实例对象
     * @return 实例对象
     */
    YlDdx insert(YlDdx ylDdx);

    /**
     * 修改数据
     *
     * @param ylDdx 实例对象
     * @return 实例对象
     */
    YlDdx update(YlDdx ylDdx);

    /**
     * 通过主键删除数据
     *
     * @param yddxid 主键
     * @return 是否成功
     */
    boolean deleteById(Long yddxid);

}