package com.slwx.service;

import com.slwx.entity.YlURole;
import java.util.List;

/**
 * (YlURole)表服务接口
 *
 * @author makejava
 * @since 2019-10-24 16:21:12
 */
public interface YlURoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param ujid 主键
     * @return 实例对象
     */
    YlURole queryById(Long ujid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlURole> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylURole 实例对象
     * @return 实例对象
     */
    YlURole insert(YlURole ylURole);

    /**
     * 修改数据
     *
     * @param ylURole 实例对象
     * @return 实例对象
     */
    YlURole update(YlURole ylURole);

    /**
     * 通过主键删除数据
     *
     * @param ujid 主键
     * @return 是否成功
     */
    boolean deleteById(Long ujid);

}