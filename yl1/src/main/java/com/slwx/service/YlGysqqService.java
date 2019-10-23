package com.slwx.service;

import com.slwx.entity.YlGysqq;
import java.util.List;

/**
 * (YlGysqq)表服务接口
 *
 * @author makejava
 * @since 2019-10-23 16:41:18
 */
public interface YlGysqqService {

    /**
     * 通过ID查询单条数据
     *
     * @param gid 主键
     * @return 实例对象
     */
    YlGysqq queryById(Long gid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlGysqq> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylGysqq 实例对象
     * @return 实例对象
     */
    YlGysqq insert(YlGysqq ylGysqq);

    /**
     * 修改数据
     *
     * @param ylGysqq 实例对象
     * @return 实例对象
     */
    YlGysqq update(YlGysqq ylGysqq);

    /**
     * 通过主键删除数据
     *
     * @param gid 主键
     * @return 是否成功
     */
    boolean deleteById(Long gid);

}