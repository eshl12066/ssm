package com.slwx.service.impl;

import com.slwx.entity.YlURole;
import com.slwx.dao.YlURoleDao;
import com.slwx.service.YlURoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlURole)表服务实现类
 *
 * @author makejava
 * @since 2019-10-23 16:41:22
 */
@Service("ylURoleService")
public class YlURoleServiceImpl implements YlURoleService {
    @Resource
    private YlURoleDao ylURoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param ujid 主键
     * @return 实例对象
     */
    @Override
    public YlURole queryById(Long ujid) {
        return this.ylURoleDao.queryById(ujid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlURole> queryAllByLimit(int offset, int limit) {
        return this.ylURoleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylURole 实例对象
     * @return 实例对象
     */
    @Override
    public YlURole insert(YlURole ylURole) {
        this.ylURoleDao.insert(ylURole);
        return ylURole;
    }

    /**
     * 修改数据
     *
     * @param ylURole 实例对象
     * @return 实例对象
     */
    @Override
    public YlURole update(YlURole ylURole) {
        this.ylURoleDao.update(ylURole);
        return this.queryById(ylURole.getUjid());
    }

    /**
     * 通过主键删除数据
     *
     * @param ujid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long ujid) {
        return this.ylURoleDao.deleteById(ujid) > 0;
    }
}