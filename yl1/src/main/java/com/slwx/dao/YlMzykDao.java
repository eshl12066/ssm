package com.slwx.dao;

import com.slwx.entity.YlMzyk;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (YlMzyk)表数据库访问层
 *
 * @author makejava
 * @since 2019-10-24 16:21:11
 */
public interface YlMzykDao {

    /**
     * 通过ID查询单条数据
     *
     * @param myno 主键
     * @return 实例对象
     */
    YlMzyk queryById(Long myno);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlMzyk> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ylMzyk 实例对象
     * @return 对象列表
     */
    List<YlMzyk> queryAll(YlMzyk ylMzyk);

    /**
     * 新增数据
     *
     * @param ylMzyk 实例对象
     * @return 影响行数
     */
    int insert(YlMzyk ylMzyk);

    /**
     * 修改数据
     *
     * @param ylMzyk 实例对象
     * @return 影响行数
     */
    int update(YlMzyk ylMzyk);

    /**
     * 通过主键删除数据
     *
     * @param myno 主键
     * @return 影响行数
     */
    int deleteById(Long myno);

}