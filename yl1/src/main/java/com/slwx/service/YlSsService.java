package com.slwx.service;

import com.slwx.entity.YlSs;
import java.util.List;

/**
 * (YlSs)表服务接口
 *
 * @author makejava
 * @since 2019-10-24 16:21:12
 */
public interface YlSsService {

    /**
     * 通过ID查询单条数据
     *
     * @param ssid 主键
     * @return 实例对象
     */
    YlSs queryById(Long ssid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlSs> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylSs 实例对象
     * @return 实例对象
     */
    YlSs insert(YlSs ylSs);

    /**
     * 修改数据
     *
     * @param ylSs 实例对象
     * @return 实例对象
     */
    YlSs update(YlSs ylSs);

    /**
     * 通过主键删除数据
     *
     * @param ssid 主键
     * @return 是否成功
     */
    boolean deleteById(Long ssid);

}