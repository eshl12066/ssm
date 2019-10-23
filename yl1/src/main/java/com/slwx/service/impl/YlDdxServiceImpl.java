package com.slwx.service.impl;

import com.slwx.entity.YlDdx;
import com.slwx.dao.YlDdxDao;
import com.slwx.service.YlDdxService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlDdx)表服务实现类
 *
 * @author makejava
 * @since 2019-10-23 16:41:18
 */
@Service("ylDdxService")
public class YlDdxServiceImpl implements YlDdxService {
    @Resource
    private YlDdxDao ylDdxDao;

    /**
     * 通过ID查询单条数据
     *
     * @param yddxid 主键
     * @return 实例对象
     */
    @Override
    public YlDdx queryById(Long yddxid) {
        return this.ylDdxDao.queryById(yddxid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlDdx> queryAllByLimit(int offset, int limit) {
        return this.ylDdxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylDdx 实例对象
     * @return 实例对象
     */
    @Override
    public YlDdx insert(YlDdx ylDdx) {
        this.ylDdxDao.insert(ylDdx);
        return ylDdx;
    }

    /**
     * 修改数据
     *
     * @param ylDdx 实例对象
     * @return 实例对象
     */
    @Override
    public YlDdx update(YlDdx ylDdx) {
        this.ylDdxDao.update(ylDdx);
        return this.queryById(ylDdx.getYddxid());
    }

    /**
     * 通过主键删除数据
     *
     * @param yddxid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long yddxid) {
        return this.ylDdxDao.deleteById(yddxid) > 0;
    }
}