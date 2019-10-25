package com.slwx.service.impl;

import com.slwx.entity.YlDd;
import com.slwx.dao.YlDdDao;
import com.slwx.service.YlDdService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlDd)表服务实现类
 *
 * @author makejava
 * @since 2019-10-24 16:21:11
 */
@Service("ylDdService")
public class YlDdServiceImpl implements YlDdService {
    @Resource
    private YlDdDao ylDdDao;

    /**
     * 通过ID查询单条数据
     *
     * @param ydid 主键
     * @return 实例对象
     */
    @Override
    public YlDd queryById(Long ydid) {
        return this.ylDdDao.queryById(ydid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlDd> queryAllByLimit(int offset, int limit) {
        return this.ylDdDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylDd 实例对象
     * @return 实例对象
     */
    @Override
    public YlDd insert(YlDd ylDd) {
        this.ylDdDao.insert(ylDd);
        return ylDd;
    }

    /**
     * 修改数据
     *
     * @param ylDd 实例对象
     * @return 实例对象
     */
    @Override
    public YlDd update(YlDd ylDd) {
        this.ylDdDao.update(ylDd);
        return this.queryById(ylDd.getYdid());
    }

    /**
     * 通过主键删除数据
     *
     * @param ydid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long ydid) {
        return this.ylDdDao.deleteById(ydid) > 0;
    }
}