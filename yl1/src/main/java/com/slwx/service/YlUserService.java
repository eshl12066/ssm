package com.slwx.service;

import com.slwx.entity.YlUser;
import com.slwx.entity.vo.YlUserVo;

import java.util.List;
import java.util.Set;

/**
 * (YlUser)表服务接口
 *
 * @author makejava
 * @since 2019-10-24 16:21:12
 */
public interface YlUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    YlUser queryById(Long uid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<YlUser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ylUser 实例对象
     * @return 实例对象
     */
    YlUser insert(YlUser ylUser);

    /**
     * 修改数据
     *
     * @param ylUser 实例对象
     * @return 实例对象
     */
    YlUser update(YlUser ylUser);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    boolean deleteById(Long uid);

    YlUser login(YlUser ylUser);

    YlUserVo queryByName(String uname);

    Set<String> getRolesByUserId(Integer uid);

    Set<String> getPersByUserId(Integer uid);
}