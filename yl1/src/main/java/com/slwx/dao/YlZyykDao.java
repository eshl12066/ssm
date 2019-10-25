package com.slwx.dao;

import com.slwx.entity.YlZyyk;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (YlZyyk)表数据库访问层
 *
 * @author makejava
 * @since 2019-10-24 16:21:21
 */
public interface YlZyykDao {

    /**
     * 通过ID查询单条数据
     *
     * @param zyno 主键
     * @return 实例对象
     */
    YlZyyk queryById(Long zyno);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlZyyk> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ylZyyk 实例对象
     * @return 对象列表
     */
    List<YlZyyk> queryAll(YlZyyk ylZyyk);

    /**
     * 新增数据
     *
     * @param ylZyyk 实例对象
     * @return 影响行数
     */
    int insert(YlZyyk ylZyyk);

    /**
     * 修改数据
     *
     * @param ylZyyk 实例对象
     * @return 影响行数
     */
    int update(YlZyyk ylZyyk);

    /**
     * 通过主键删除数据
     *
     * @param zyno 主键
     * @return 影响行数
     */
    int deleteById(Long zyno);

}