package com.slwx.dao;

import com.slwx.entity.YlPer;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (YlPer)表数据库访问层
 *
 * @author makejava
 * @since 2019-10-23 16:41:21
 */
public interface YlPerDao {

    /**
     * 通过ID查询单条数据
     *
     * @param perid 主键
     * @return 实例对象
     */
    YlPer queryById(Long perid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlPer> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ylPer 实例对象
     * @return 对象列表
     */
    List<YlPer> queryAll(YlPer ylPer);

    /**
     * 新增数据
     *
     * @param ylPer 实例对象
     * @return 影响行数
     */
    int insert(YlPer ylPer);

    /**
     * 修改数据
     *
     * @param ylPer 实例对象
     * @return 影响行数
     */
    int update(YlPer ylPer);

    /**
     * 通过主键删除数据
     *
     * @param perid 主键
     * @return 影响行数
     */
    int deleteById(Long perid);

}