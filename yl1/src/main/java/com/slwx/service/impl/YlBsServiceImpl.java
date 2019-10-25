package com.slwx.service.impl;

import com.slwx.entity.YlBs;
import com.slwx.dao.YlBsDao;
import com.slwx.service.YlBsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlBs)表服务实现类
 *
 * @author makejava
 * @since 2019-10-24 16:21:10
 */
@Service("ylBsService")
public class YlBsServiceImpl implements YlBsService {
    @Resource
    private YlBsDao ylBsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param bid 主键
     * @return 实例对象
     */
    @Override
    public YlBs queryById(Long bid) {
        return this.ylBsDao.queryById(bid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlBs> queryAllByLimit(int offset, int limit) {
        return this.ylBsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylBs 实例对象
     * @return 实例对象
     */
    @Override
    public YlBs insert(YlBs ylBs) {
        this.ylBsDao.insert(ylBs);
        return ylBs;
    }

    /**
     * 修改数据
     *
     * @param ylBs 实例对象
     * @return 实例对象
     */
    @Override
    public YlBs update(YlBs ylBs) {
        this.ylBsDao.update(ylBs);
        return this.queryById(ylBs.getBid());
    }

    /**
     * 通过主键删除数据
     *
     * @param bid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long bid) {
        return this.ylBsDao.deleteById(bid) > 0;
    }
}