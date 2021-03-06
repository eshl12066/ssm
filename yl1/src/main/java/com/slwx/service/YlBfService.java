package com.slwx.service;

import com.slwx.entity.YlBf;
import java.util.List;

/**
 * (YlBf)表服务接口
 *
 * @author makejava
 * @since 2019-10-24 16:21:10
 */
public interface YlBfService {

    /**
     * 通过ID查询单条数据
     *
     * @param bfid 主键
     * @return 实例对象
     */
    YlBf queryById(Long bfid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlBf> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylBf 实例对象
     * @return 实例对象
     */
    YlBf insert(YlBf ylBf);

    /**
     * 修改数据
     *
     * @param ylBf 实例对象
     * @return 实例对象
     */
    YlBf update(YlBf ylBf);

    /**
     * 通过主键删除数据
     *
     * @param bfid 主键
     * @return 是否成功
     */
    boolean deleteById(Long bfid);

}