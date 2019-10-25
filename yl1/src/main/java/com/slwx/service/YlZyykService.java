package com.slwx.service;

import com.slwx.entity.YlZyyk;
import java.util.List;

/**
 * (YlZyyk)表服务接口
 *
 * @author makejava
 * @since 2019-10-24 16:21:21
 */
public interface YlZyykService {

    /**
     * 通过ID查询单条数据
     *
     * @param zyno 主键
     * @return 实例对象
     */
    YlZyyk queryById(Long zyno);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlZyyk> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylZyyk 实例对象
     * @return 实例对象
     */
    YlZyyk insert(YlZyyk ylZyyk);

    /**
     * 修改数据
     *
     * @param ylZyyk 实例对象
     * @return 实例对象
     */
    YlZyyk update(YlZyyk ylZyyk);

    /**
     * 通过主键删除数据
     *
     * @param zyno 主键
     * @return 是否成功
     */
    boolean deleteById(Long zyno);

}