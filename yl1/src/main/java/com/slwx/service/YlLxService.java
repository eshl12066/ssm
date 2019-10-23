package com.slwx.service;

import com.slwx.entity.YlLx;
import java.util.List;

/**
 * (YlLx)表服务接口
 *
 * @author makejava
 * @since 2019-10-23 16:41:21
 */
public interface YlLxService {

    /**
     * 通过ID查询单条数据
     *
     * @param lxno 主键
     * @return 实例对象
     */
    YlLx queryById(Long lxno);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlLx> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylLx 实例对象
     * @return 实例对象
     */
    YlLx insert(YlLx ylLx);

    /**
     * 修改数据
     *
     * @param ylLx 实例对象
     * @return 实例对象
     */
    YlLx update(YlLx ylLx);

    /**
     * 通过主键删除数据
     *
     * @param lxno 主键
     * @return 是否成功
     */
    boolean deleteById(Long lxno);

}