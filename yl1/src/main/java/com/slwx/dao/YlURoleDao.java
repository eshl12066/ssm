package com.slwx.dao;

import com.slwx.entity.YlURole;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (YlURole)表数据库访问层
 *
 * @author makejava
 * @since 2019-10-23 16:41:22
 */
public interface YlURoleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param ujid 主键
     * @return 实例对象
     */
    YlURole queryById(Long ujid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlURole> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ylURole 实例对象
     * @return 对象列表
     */
    List<YlURole> queryAll(YlURole ylURole);

    /**
     * 新增数据
     *
     * @param ylURole 实例对象
     * @return 影响行数
     */
    int insert(YlURole ylURole);

    /**
     * 修改数据
     *
     * @param ylURole 实例对象
     * @return 影响行数
     */
    int update(YlURole ylURole);

    /**
     * 通过主键删除数据
     *
     * @param ujid 主键
     * @return 影响行数
     */
    int deleteById(Long ujid);

}