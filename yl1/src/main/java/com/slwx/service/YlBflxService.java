package com.slwx.service;

import com.slwx.entity.YlBflx;
import java.util.List;

/**
 * (YlBflx)表服务接口
 *
 * @author makejava
 * @since 2019-10-24 16:21:10
 */
public interface YlBflxService {

    /**
     * 通过ID查询单条数据
     *
     * @param bflxid 主键
     * @return 实例对象
     */
    YlBflx queryById(Long bflxid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlBflx> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylBflx 实例对象
     * @return 实例对象
     */
    YlBflx insert(YlBflx ylBflx);

    /**
     * 修改数据
     *
     * @param ylBflx 实例对象
     * @return 实例对象
     */
    YlBflx update(YlBflx ylBflx);

    /**
     * 通过主键删除数据
     *
     * @param bflxid 主键
     * @return 是否成功
     */
    boolean deleteById(Long bflxid);

}