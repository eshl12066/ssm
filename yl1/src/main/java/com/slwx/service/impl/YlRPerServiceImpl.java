package com.slwx.service.impl;

import com.slwx.entity.YlRPer;
import com.slwx.dao.YlRPerDao;
import com.slwx.service.YlRPerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlRPer)表服务实现类
 *
 * @author makejava
 * @since 2019-10-23 16:41:21
 */
@Service("ylRPerService")
public class YlRPerServiceImpl implements YlRPerService {
    @Resource
    private YlRPerDao ylRPerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param jpid 主键
     * @return 实例对象
     */
    @Override
    public YlRPer queryById(Long jpid) {
        return this.ylRPerDao.queryById(jpid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlRPer> queryAllByLimit(int offset, int limit) {
        return this.ylRPerDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylRPer 实例对象
     * @return 实例对象
     */
    @Override
    public YlRPer insert(YlRPer ylRPer) {
        this.ylRPerDao.insert(ylRPer);
        return ylRPer;
    }

    /**
     * 修改数据
     *
     * @param ylRPer 实例对象
     * @return 实例对象
     */
    @Override
    public YlRPer update(YlRPer ylRPer) {
        this.ylRPerDao.update(ylRPer);
        return this.queryById(ylRPer.getJpid());
    }

    /**
     * 通过主键删除数据
     *
     * @param jpid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long jpid) {
        return this.ylRPerDao.deleteById(jpid) > 0;
    }
}