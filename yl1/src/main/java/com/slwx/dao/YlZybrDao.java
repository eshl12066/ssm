package com.slwx.dao;

import com.slwx.entity.YlGh;
import com.slwx.entity.YlZybr;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * (YlZybr)表数据库访问层
 *
 * @author makejava
 * @since 2019-10-24 16:21:21
 */
public interface YlZybrDao {

    /**
     * 通过ID查询单条数据
     *
     * @param ihno 主键
     * @return 实例对象
     */
    YlZybr queryById(Long ihno);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlZybr> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ylZybr 实例对象
     * @return 对象列表
     */
    List<YlZybr> queryAll(YlZybr ylZybr);

    /**
     * 新增数据
     *
     * @param ylZybr 实例对象
     * @return 影响行数
     */
    int insert(YlZybr ylZybr);

    /**
     * 修改数据
     *
     * @param ylZybr 实例对象
     * @return 影响行数
     */
    int update(YlZybr ylZybr);

    /**
     * 通过主键删除数据
     *
     * @param ihno 主键
     * @return 影响行数
     */
    int deleteById(Long ihno);

    List<Map> list(YlZybr ylZybr);
}