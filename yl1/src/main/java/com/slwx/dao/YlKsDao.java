package com.slwx.dao;

import com.slwx.entity.YlKs;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (YlKs)表数据库访问层
 *
 * @author makejava
 * @since 2019-10-24 16:21:11
 */
public interface YlKsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param sno 主键
     * @return 实例对象
     */
    YlKs queryById(Long sno);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlKs> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ylKs 实例对象
     * @return 对象列表
     */
    List<YlKs> queryAll(YlKs ylKs);

    /**
     * 新增数据
     *
     * @param ylKs 实例对象
     * @return 影响行数
     */
    int insert(YlKs ylKs);

    /**
     * 修改数据
     *
     * @param ylKs 实例对象
     * @return 影响行数
     */
    int update(YlKs ylKs);

    /**
     * 通过主键删除数据
     *
     * @param sno 主键
     * @return 影响行数
     */
    int deleteById(Long sno);

}