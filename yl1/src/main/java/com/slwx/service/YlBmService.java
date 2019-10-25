package com.slwx.service;

import com.slwx.entity.YlBm;
import java.util.List;

/**
 * (YlBm)表服务接口
 *
 * @author makejava
 * @since 2019-10-24 16:21:10
 */
public interface YlBmService {

    /**
     * 通过ID查询单条数据
     *
     * @param bmid 主键
     * @return 实例对象
     */
    YlBm queryById(Long bmid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlBm> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylBm 实例对象
     * @return 实例对象
     */
    YlBm insert(YlBm ylBm);

    /**
     * 修改数据
     *
     * @param ylBm 实例对象
     * @return 实例对象
     */
    YlBm update(YlBm ylBm);

    /**
     * 通过主键删除数据
     *
     * @param bmid 主键
     * @return 是否成功
     */
    boolean deleteById(Long bmid);

}