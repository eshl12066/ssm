package com.slwx.service.impl;

import com.slwx.entity.YlUser;
import com.slwx.dao.YlUserDao;
import com.slwx.service.YlUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlUser)表服务实现类
 *
 * @author makejava
 * @since 2019-10-24 16:21:12
 */
@Service
public class YlUserServiceImpl implements YlUserService {
    @Autowired
    private YlUserDao ylUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public YlUser queryById(Long uid) {
        return this.ylUserDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlUser> queryAllByLimit(int offset, int limit) {
        return this.ylUserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylUser 实例对象
     * @return 实例对象
     */
    @Override
    public YlUser insert(YlUser ylUser) {
        this.ylUserDao.insert(ylUser);
        return ylUser;
    }

    /**
     * 修改数据
     *
     * @param ylUser 实例对象
     * @return 实例对象
     */
    @Override
    public YlUser update(YlUser ylUser) {
        this.ylUserDao.update(ylUser);
        return this.queryById(ylUser.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long uid) {
        return this.ylUserDao.deleteById(uid) > 0;
    }

    @Override
    public YlUser login(YlUser ylUser) {
        return this.ylUserDao.login(ylUser);
    }
}