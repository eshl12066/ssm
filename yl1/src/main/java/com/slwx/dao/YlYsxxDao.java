package com.slwx.dao;

import com.slwx.entity.YlYsxx;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (YlYsxx)表数据库访问层
 *
 * @author makejava
 * @since 2019-10-24 16:21:17
 */
public interface YlYsxxDao {

    /**
     * 通过ID查询单条数据
     *
     * @param dno 主键
     * @return 实例对象
     */
    YlYsxx queryById(Long dno);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlYsxx> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ylYsxx 实例对象
     * @return 对象列表
     */
    List<YlYsxx> queryAll(YlYsxx ylYsxx);

    /**
     * 新增数据
     *
     * @param ylYsxx 实例对象
     * @return 影响行数
     */
    int insert(YlYsxx ylYsxx);

    /**
     * 修改数据
     *
     * @param ylYsxx 实例对象
     * @return 影响行数
     */
    int update(YlYsxx ylYsxx);

    /**
     * 通过主键删除数据
     *
     * @param dno 主键
     * @return 影响行数
     */
    int deleteById(Long dno);

}