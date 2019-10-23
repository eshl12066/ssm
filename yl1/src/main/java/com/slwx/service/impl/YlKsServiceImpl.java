package com.slwx.service.impl;

import com.slwx.entity.YlKs;
import com.slwx.dao.YlKsDao;
import com.slwx.service.YlKsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlKs)表服务实现类
 *
 * @author makejava
 * @since 2019-10-23 16:41:21
 */
@Service("ylKsService")
public class YlKsServiceImpl implements YlKsService {
    @Resource
    private YlKsDao ylKsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param sno 主键
     * @return 实例对象
     */
    @Override
    public YlKs queryById(Long sno) {
        return this.ylKsDao.queryById(sno);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlKs> queryAllByLimit(int offset, int limit) {
        return this.ylKsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylKs 实例对象
     * @return 实例对象
     */
    @Override
    public YlKs insert(YlKs ylKs) {
        this.ylKsDao.insert(ylKs);
        return ylKs;
    }

    /**
     * 修改数据
     *
     * @param ylKs 实例对象
     * @return 实例对象
     */
    @Override
    public YlKs update(YlKs ylKs) {
        this.ylKsDao.update(ylKs);
        return this.queryById(ylKs.getSno());
    }

    /**
     * 通过主键删除数据
     *
     * @param sno 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long sno) {
        return this.ylKsDao.deleteById(sno) > 0;
    }
}