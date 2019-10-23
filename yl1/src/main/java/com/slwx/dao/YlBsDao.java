package com.slwx.dao;

import com.slwx.entity.YlBs;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (YlBs)表数据库访问层
 *
 * @author makejava
 * @since 2019-10-23 16:41:18
 */
public interface YlBsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param bid 主键
     * @return 实例对象
     */
    YlBs queryById(Long bid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlBs> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ylBs 实例对象
     * @return 对象列表
     */
    List<YlBs> queryAll(YlBs ylBs);

    /**
     * 新增数据
     *
     * @param ylBs 实例对象
     * @return 影响行数
     */
    int insert(YlBs ylBs);

    /**
     * 修改数据
     *
     * @param ylBs 实例对象
     * @return 影响行数
     */
    int update(YlBs ylBs);

    /**
     * 通过主键删除数据
     *
     * @param bid 主键
     * @return 影响行数
     */
    int deleteById(Long bid);

}