package com.slwx.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (YlBflx)表数据库访问层
 *
 * @author makejava
 * @since 2019-10-24 16:21:10
 */
public interface YlBflxDao {

    /**
     * 通过ID查询单条数据
     *
     * @param bflxid 主键
     * @return 实例对象
     */
    YlBflx queryById(Long bflxid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlBflx> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ylBflx 实例对象
     * @return 对象列表
     */
    List<YlBflx> queryAll(YlBflx ylBflx);

    /**
     * 新增数据
     *
     * @param ylBflx 实例对象
     * @return 影响行数
     */
    int insert(YlBflx ylBflx);

    /**
     * 修改数据
     *
     * @param ylBflx 实例对象
     * @return 影响行数
     */
    int update(YlBflx ylBflx);

    /**
     * 通过主键删除数据
     *
     * @param bflxid 主键
     * @return 影响行数
     */
    int deleteById(Long bflxid);

}