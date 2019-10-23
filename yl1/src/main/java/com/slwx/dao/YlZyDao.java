package com.slwx.dao;

import com.slwx.entity.YlZy;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (YlZy)表数据库访问层
 *
 * @author makejava
 * @since 2019-10-23 16:41:23
 */
public interface YlZyDao {

    /**
     * 通过ID查询单条数据
     *
     * @param zyid 主键
     * @return 实例对象
     */
    YlZy queryById(Long zyid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlZy> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ylZy 实例对象
     * @return 对象列表
     */
    List<YlZy> queryAll(YlZy ylZy);

    /**
     * 新增数据
     *
     * @param ylZy 实例对象
     * @return 影响行数
     */
    int insert(YlZy ylZy);

    /**
     * 修改数据
     *
     * @param ylZy 实例对象
     * @return 影响行数
     */
    int update(YlZy ylZy);

    /**
     * 通过主键删除数据
     *
     * @param zyid 主键
     * @return 影响行数
     */
    int deleteById(Long zyid);

}