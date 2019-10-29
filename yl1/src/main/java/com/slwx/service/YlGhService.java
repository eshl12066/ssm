package com.slwx.service;

import com.slwx.entity.YlGh;
import com.slwx.util.PageBean;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * (YlGh)表服务接口
 *
 * @author makejava
 * @since 2019-10-24 16:21:11
 */

@Repository
public interface YlGhService {

    /**
     * 通过ID查询单条数据
     *
     * @param rno 主键
     * @return 实例对象
     */
    YlGh queryById(Long rno);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlGh> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylGh 实例对象
     * @return 实例对象
     */
    int insert(YlGh ylGh);

    /**
     * 修改数据
     *
     * @param ylGh 实例对象
     * @return 实例对象
     */
    YlGh update(YlGh ylGh);

    /**
     * 通过主键删除数据
     *
     * @param rno 主键
     * @return 是否成功
     */
    boolean deleteById(Long rno);

     List<Map> selectgetAllPager(YlGh ylGh, PageBean pageBean);

}