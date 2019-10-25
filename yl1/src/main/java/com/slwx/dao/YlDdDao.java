package com.slwx.dao;

import com.slwx.entity.YlDd;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (YlDd)表数据库访问层
 *
 * @author makejava
 * @since 2019-10-24 16:21:11
 */
public interface YlDdDao {

    /**
     * 通过ID查询单条数据
     *
     * @param ydid 主键
     * @return 实例对象
     */
    YlDd queryById(Long ydid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlDd> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ylDd 实例对象
     * @return 对象列表
     */
    List<YlDd> queryAll(YlDd ylDd);

    /**
     * 新增数据
     *
     * @param ylDd 实例对象
     * @return 影响行数
     */
    int insert(YlDd ylDd);

    /**
     * 修改数据
     *
     * @param ylDd 实例对象
     * @return 影响行数
     */
    int update(YlDd ylDd);

    /**
     * 通过主键删除数据
     *
     * @param ydid 主键
     * @return 影响行数
     */
    int deleteById(Long ydid);

}