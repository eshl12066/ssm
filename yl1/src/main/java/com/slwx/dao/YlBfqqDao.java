package com.slwx.dao;

import com.slwx.entity.YlBfqq;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (YlBfqq)表数据库访问层
 *
 * @author makejava
 * @since 2019-10-24 16:21:10
 */
public interface YlBfqqDao {

    /**
     * 通过ID查询单条数据
     *
     * @param qid 主键
     * @return 实例对象
     */
    YlBfqq queryById(Long qid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlBfqq> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ylBfqq 实例对象
     * @return 对象列表
     */
    List<YlBfqq> queryAll(YlBfqq ylBfqq);

    /**
     * 新增数据
     *
     * @param ylBfqq 实例对象
     * @return 影响行数
     */
    int insert(YlBfqq ylBfqq);

    /**
     * 修改数据
     *
     * @param ylBfqq 实例对象
     * @return 影响行数
     */
    int update(YlBfqq ylBfqq);

    /**
     * 通过主键删除数据
     *
     * @param qid 主键
     * @return 影响行数
     */
    int deleteById(Long qid);

}