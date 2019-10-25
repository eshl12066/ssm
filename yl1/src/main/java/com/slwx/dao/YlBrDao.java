package com.slwx.dao;

import com.slwx.entity.YlBr;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (YlBr)表数据库访问层
 *
 * @author makejava
 * @since 2019-10-24 16:21:10
 */
public interface YlBrDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pno 主键
     * @return 实例对象
     */
    YlBr queryById(Long pno);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlBr> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ylBr 实例对象
     * @return 对象列表
     */
    List<YlBr> queryAll(YlBr ylBr);

    /**
     * 新增数据
     *
     * @param ylBr 实例对象
     * @return 影响行数
     */
    int insert(YlBr ylBr);

    /**
     * 修改数据
     *
     * @param ylBr 实例对象
     * @return 影响行数
     */
    int update(YlBr ylBr);

    /**
     * 通过主键删除数据
     *
     * @param pno 主键
     * @return 影响行数
     */
    int deleteById(Long pno);

}