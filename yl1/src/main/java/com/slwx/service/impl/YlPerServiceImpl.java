package com.slwx.service.impl;

import com.slwx.entity.YlPer;
import com.slwx.dao.YlPerDao;
import com.slwx.service.YlPerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlPer)表服务实现类
 *
 * @author makejava
 * @since 2019-10-23 16:41:21
 */
@Service("ylPerService")
public class YlPerServiceImpl implements YlPerService {
    @Resource
    private YlPerDao ylPerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param perid 主键
     * @return 实例对象
     */
    @Override
    public YlPer queryById(Long perid) {
        return this.ylPerDao.queryById(perid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlPer> queryAllByLimit(int offset, int limit) {
        return this.ylPerDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylPer 实例对象
     * @return 实例对象
     */
    @Override
    public YlPer insert(YlPer ylPer) {
        this.ylPerDao.insert(ylPer);
        return ylPer;
    }

    /**
     * 修改数据
     *
     * @param ylPer 实例对象
     * @return 实例对象
     */
    @Override
    public YlPer update(YlPer ylPer) {
        this.ylPerDao.update(ylPer);
        return this.queryById(ylPer.getPerid());
    }

    /**
     * 通过主键删除数据
     *
     * @param perid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long perid) {
        return this.ylPerDao.deleteById(perid) > 0;
    }
}