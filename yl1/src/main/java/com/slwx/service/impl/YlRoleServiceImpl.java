package com.slwx.service.impl;

import com.slwx.entity.YlRole;
import com.slwx.dao.YlRoleDao;
import com.slwx.service.YlRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlRole)表服务实现类
 *
 * @author makejava
 * @since 2019-10-24 16:21:12
 */
@Service("ylRoleService")
public class YlRoleServiceImpl implements YlRoleService {
    @Resource
    private YlRoleDao ylRoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param jid 主键
     * @return 实例对象
     */
    @Override
    public YlRole queryById(Long jid) {
        return this.ylRoleDao.queryById(jid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlRole> queryAllByLimit(int offset, int limit) {
        return this.ylRoleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylRole 实例对象
     * @return 实例对象
     */
    @Override
    public YlRole insert(YlRole ylRole) {
        this.ylRoleDao.insert(ylRole);
        return ylRole;
    }

    /**
     * 修改数据
     *
     * @param ylRole 实例对象
     * @return 实例对象
     */
    @Override
    public YlRole update(YlRole ylRole) {
        this.ylRoleDao.update(ylRole);
        return this.queryById(ylRole.getJid());
    }

    /**
     * 通过主键删除数据
     *
     * @param jid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long jid) {
        return this.ylRoleDao.deleteById(jid) > 0;
    }
}