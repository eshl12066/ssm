package com.slwx.service.impl;

import com.slwx.entity.YlSs;
import com.slwx.dao.YlSsDao;
import com.slwx.service.YlSsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlSs)表服务实现类
 *
 * @author makejava
 * @since 2019-10-24 16:21:12
 */
@Service("ylSsService")
public class YlSsServiceImpl implements YlSsService {
    @Resource
    private YlSsDao ylSsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param ssid 主键
     * @return 实例对象
     */
    @Override
    public YlSs queryById(Long ssid) {
        return this.ylSsDao.queryById(ssid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlSs> queryAllByLimit(int offset, int limit) {
        return this.ylSsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylSs 实例对象
     * @return 实例对象
     */
    @Override
    public YlSs insert(YlSs ylSs) {
        this.ylSsDao.insert(ylSs);
        return ylSs;
    }

    /**
     * 修改数据
     *
     * @param ylSs 实例对象
     * @return 实例对象
     */
    @Override
    public YlSs update(YlSs ylSs) {
        this.ylSsDao.update(ylSs);
        return this.queryById(ylSs.getSsid());
    }

    /**
     * 通过主键删除数据
     *
     * @param ssid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long ssid) {
        return this.ylSsDao.deleteById(ssid) > 0;
    }
}