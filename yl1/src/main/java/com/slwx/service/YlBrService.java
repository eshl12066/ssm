package com.slwx.service;

import com.slwx.entity.YlBr;
import java.util.List;

/**
 * (YlBr)表服务接口
 *
 * @author makejava
 * @since 2019-10-23 16:41:18
 */
public interface YlBrService {

    /**
     * 通过ID查询单条数据
     *
     * @param pno 主键
     * @return 实例对象
     */
    YlBr queryById(Long pno);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlBr> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylBr 实例对象
     * @return 实例对象
     */
    YlBr insert(YlBr ylBr);

    /**
     * 修改数据
     *
     * @param ylBr 实例对象
     * @return 实例对象
     */
    YlBr update(YlBr ylBr);

    /**
     * 通过主键删除数据
     *
     * @param pno 主键
     * @return 是否成功
     */
    boolean deleteById(Long pno);

}