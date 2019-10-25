package com.slwx.service;

import com.slwx.entity.YlRole;
import java.util.List;

/**
 * (YlRole)表服务接口
 *
 * @author makejava
 * @since 2019-10-24 16:21:12
 */
public interface YlRoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param jid 主键
     * @return 实例对象
     */
    YlRole queryById(Long jid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlRole> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylRole 实例对象
     * @return 实例对象
     */
    YlRole insert(YlRole ylRole);

    /**
     * 修改数据
     *
     * @param ylRole 实例对象
     * @return 实例对象
     */
    YlRole update(YlRole ylRole);

    /**
     * 通过主键删除数据
     *
     * @param jid 主键
     * @return 是否成功
     */
    boolean deleteById(Long jid);

}