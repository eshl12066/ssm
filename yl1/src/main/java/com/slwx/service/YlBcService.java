package com.slwx.service;

import com.slwx.entity.YlBc;
import java.util.List;

/**
 * (YlBc)表服务接口
 *
 * @author makejava
 * @since 2019-10-23 16:41:17
 */
public interface YlBcService {

    /**
     * 通过ID查询单条数据
     *
     * @param bcid 主键
     * @return 实例对象
     */
    YlBc queryById(Long bcid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlBc> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylBc 实例对象
     * @return 实例对象
     */
    YlBc insert(YlBc ylBc);

    /**
     * 修改数据
     *
     * @param ylBc 实例对象
     * @return 实例对象
     */
    YlBc update(YlBc ylBc);

    /**
     * 通过主键删除数据
     *
     * @param bcid 主键
     * @return 是否成功
     */
    boolean deleteById(Long bcid);

}