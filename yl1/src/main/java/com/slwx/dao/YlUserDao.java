package com.slwx.dao;

import com.slwx.entity.YlUser;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (YlUser)表数据库访问层
 *
 * @author makejava
 * @since 2019-10-24 16:21:12
 */
public interface YlUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    YlUser queryById(Long uid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlUser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ylUser 实例对象
     * @return 对象列表
     */
    List<YlUser> queryAll(YlUser ylUser);

    /**
     * 新增数据
     *
     * @param ylUser 实例对象
     * @return 影响行数
     */
    int insert(YlUser ylUser);

    /**
     * 修改数据
     *
     * @param ylUser 实例对象
     * @return 影响行数
     */
    int update(YlUser ylUser);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 影响行数
     */
    int deleteById(Long uid);

    int login(YlUser ylUser);
}