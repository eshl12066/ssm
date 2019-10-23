package com.slwx.dao;

import com.slwx.entity.YlSs;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (YlSs)表数据库访问层
 *
 * @author makejava
 * @since 2019-10-23 16:41:21
 */
public interface YlSsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param ssid 主键
     * @return 实例对象
     */
    YlSs queryById(Long ssid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlSs> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ylSs 实例对象
     * @return 对象列表
     */
    List<YlSs> queryAll(YlSs ylSs);

    /**
     * 新增数据
     *
     * @param ylSs 实例对象
     * @return 影响行数
     */
    int insert(YlSs ylSs);

    /**
     * 修改数据
     *
     * @param ylSs 实例对象
     * @return 影响行数
     */
    int update(YlSs ylSs);

    /**
     * 通过主键删除数据
     *
     * @param ssid 主键
     * @return 影响行数
     */
    int deleteById(Long ssid);

}