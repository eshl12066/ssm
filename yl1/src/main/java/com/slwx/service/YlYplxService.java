package com.slwx.service;

import com.slwx.entity.YlYplx;
import java.util.List;

/**
 * (YlYplx)表服务接口
 *
 * @author makejava
 * @since 2019-10-23 16:41:22
 */
public interface YlYplxService {

    /**
     * 通过ID查询单条数据
     *
     * @param ylxno 主键
     * @return 实例对象
     */
    YlYplx queryById(Long ylxno);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlYplx> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylYplx 实例对象
     * @return 实例对象
     */
    YlYplx insert(YlYplx ylYplx);

    /**
     * 修改数据
     *
     * @param ylYplx 实例对象
     * @return 实例对象
     */
    YlYplx update(YlYplx ylYplx);

    /**
     * 通过主键删除数据
     *
     * @param ylxno 主键
     * @return 是否成功
     */
    boolean deleteById(Long ylxno);

}