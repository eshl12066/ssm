package com.slwx.service;

import com.slwx.entity.YlBxlx;
import java.util.List;

/**
 * (YlBxlx)表服务接口
 *
 * @author makejava
 * @since 2019-10-23 16:41:18
 */
public interface YlBxlxService {

    /**
     * 通过ID查询单条数据
     *
     * @param bno 主键
     * @return 实例对象
     */
    YlBxlx queryById(Long bno);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlBxlx> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylBxlx 实例对象
     * @return 实例对象
     */
    YlBxlx insert(YlBxlx ylBxlx);

    /**
     * 修改数据
     *
     * @param ylBxlx 实例对象
     * @return 实例对象
     */
    YlBxlx update(YlBxlx ylBxlx);

    /**
     * 通过主键删除数据
     *
     * @param bno 主键
     * @return 是否成功
     */
    boolean deleteById(Long bno);

}