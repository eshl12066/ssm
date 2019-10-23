package com.slwx.dao;

import com.slwx.entity.YlZxyk;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (YlZxyk)表数据库访问层
 *
 * @author makejava
 * @since 2019-10-23 16:41:22
 */
public interface YlZxykDao {

    /**
     * 通过ID查询单条数据
     *
     * @param yno 主键
     * @return 实例对象
     */
    YlZxyk queryById(Long yno);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlZxyk> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ylZxyk 实例对象
     * @return 对象列表
     */
    List<YlZxyk> queryAll(YlZxyk ylZxyk);

    /**
     * 新增数据
     *
     * @param ylZxyk 实例对象
     * @return 影响行数
     */
    int insert(YlZxyk ylZxyk);

    /**
     * 修改数据
     *
     * @param ylZxyk 实例对象
     * @return 影响行数
     */
    int update(YlZxyk ylZxyk);

    /**
     * 通过主键删除数据
     *
     * @param yno 主键
     * @return 影响行数
     */
    int deleteById(Long yno);

}