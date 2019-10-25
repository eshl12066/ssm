package com.slwx.service;

import com.slwx.entity.YlBfqq;
import java.util.List;

/**
 * (YlBfqq)表服务接口
 *
 * @author makejava
 * @since 2019-10-24 16:21:10
 */
public interface YlBfqqService {

    /**
     * 通过ID查询单条数据
     *
     * @param qid 主键
     * @return 实例对象
     */
    YlBfqq queryById(Long qid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlBfqq> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylBfqq 实例对象
     * @return 实例对象
     */
    YlBfqq insert(YlBfqq ylBfqq);

    /**
     * 修改数据
     *
     * @param ylBfqq 实例对象
     * @return 实例对象
     */
    YlBfqq update(YlBfqq ylBfqq);

    /**
     * 通过主键删除数据
     *
     * @param qid 主键
     * @return 是否成功
     */
    boolean deleteById(Long qid);

}