package com.slwx.dao;

import com.slwx.entity.YlYplx;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (YlYplx)表数据库访问层
 *
 * @author makejava
 * @since 2019-10-23 16:41:22
 */
public interface YlYplxDao {

    /**
     * 通过ID查询单条数据
     *
     * @param ylxno 主键
     * @return 实例对象
     */
    YlYplx queryById(Long ylxno);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlYplx> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ylYplx 实例对象
     * @return 对象列表
     */
    List<YlYplx> queryAll(YlYplx ylYplx);

    /**
     * 新增数据
     *
     * @param ylYplx 实例对象
     * @return 影响行数
     */
    int insert(YlYplx ylYplx);

    /**
     * 修改数据
     *
     * @param ylYplx 实例对象
     * @return 影响行数
     */
    int update(YlYplx ylYplx);

    /**
     * 通过主键删除数据
     *
     * @param ylxno 主键
     * @return 影响行数
     */
    int deleteById(Long ylxno);

}