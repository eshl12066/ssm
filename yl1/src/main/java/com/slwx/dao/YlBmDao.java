package com.slwx.dao;

import com.slwx.entity.YlBm;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (YlBm)表数据库访问层
 *
 * @author makejava
 * @since 2019-10-23 16:41:17
 */
public interface YlBmDao {

    /**
     * 通过ID查询单条数据
     *
     * @param bmid 主键
     * @return 实例对象
     */
    YlBm queryById(Long bmid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlBm> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ylBm 实例对象
     * @return 对象列表
     */
    List<YlBm> queryAll(YlBm ylBm);

    /**
     * 新增数据
     *
     * @param ylBm 实例对象
     * @return 影响行数
     */
    int insert(YlBm ylBm);

    /**
     * 修改数据
     *
     * @param ylBm 实例对象
     * @return 影响行数
     */
    int update(YlBm ylBm);

    /**
     * 通过主键删除数据
     *
     * @param bmid 主键
     * @return 影响行数
     */
    int deleteById(Long bmid);

}