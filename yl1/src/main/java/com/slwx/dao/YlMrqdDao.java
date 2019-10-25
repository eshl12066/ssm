package com.slwx.dao;

import com.slwx.entity.YlMrqd;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (YlMrqd)表数据库访问层
 *
 * @author makejava
 * @since 2019-10-24 16:21:11
 */
public interface YlMrqdDao {

    /**
     * 通过ID查询单条数据
     *
     * @param mrqdid 主键
     * @return 实例对象
     */
    YlMrqd queryById(Long mrqdid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlMrqd> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ylMrqd 实例对象
     * @return 对象列表
     */
    List<YlMrqd> queryAll(YlMrqd ylMrqd);

    /**
     * 新增数据
     *
     * @param ylMrqd 实例对象
     * @return 影响行数
     */
    int insert(YlMrqd ylMrqd);

    /**
     * 修改数据
     *
     * @param ylMrqd 实例对象
     * @return 影响行数
     */
    int update(YlMrqd ylMrqd);

    /**
     * 通过主键删除数据
     *
     * @param mrqdid 主键
     * @return 影响行数
     */
    int deleteById(Long mrqdid);

}