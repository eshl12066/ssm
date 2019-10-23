package com.slwx.service;

import com.slwx.entity.YlKs;
import java.util.List;

/**
 * (YlKs)表服务接口
 *
 * @author makejava
 * @since 2019-10-23 16:41:21
 */
public interface YlKsService {

    /**
     * 通过ID查询单条数据
     *
     * @param sno 主键
     * @return 实例对象
     */
    YlKs queryById(Long sno);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlKs> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylKs 实例对象
     * @return 实例对象
     */
    YlKs insert(YlKs ylKs);

    /**
     * 修改数据
     *
     * @param ylKs 实例对象
     * @return 实例对象
     */
    YlKs update(YlKs ylKs);

    /**
     * 通过主键删除数据
     *
     * @param sno 主键
     * @return 是否成功
     */
    boolean deleteById(Long sno);

}