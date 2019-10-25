package com.slwx.dao;

import com.slwx.entity.YlRole;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (YlRole)表数据库访问层
 *
 * @author makejava
 * @since 2019-10-24 16:21:12
 */
public interface YlRoleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param jid 主键
     * @return 实例对象
     */
    YlRole queryById(Long jid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlRole> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ylRole 实例对象
     * @return 对象列表
     */
    List<YlRole> queryAll(YlRole ylRole);

    /**
     * 新增数据
     *
     * @param ylRole 实例对象
     * @return 影响行数
     */
    int insert(YlRole ylRole);

    /**
     * 修改数据
     *
     * @param ylRole 实例对象
     * @return 影响行数
     */
    int update(YlRole ylRole);

    /**
     * 通过主键删除数据
     *
     * @param jid 主键
     * @return 影响行数
     */
    int deleteById(Long jid);

}