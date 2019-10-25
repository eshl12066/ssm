package com.slwx.service.impl;

import com.slwx.entity.YlZdxx;
import com.slwx.dao.YlZdxxDao;
import com.slwx.service.YlZdxxService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlZdxx)表服务实现类
 *
 * @author makejava
 * @since 2019-10-24 16:21:21
 */
@Service("ylZdxxService")
public class YlZdxxServiceImpl implements YlZdxxService {
    @Resource
    private YlZdxxDao ylZdxxDao;

    /**
     * 通过ID查询单条数据
     *
     * @param rid 主键
     * @return 实例对象
     */
    @Override
    public YlZdxx queryById(Long rid) {
        return this.ylZdxxDao.queryById(rid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlZdxx> queryAllByLimit(int offset, int limit) {
        return this.ylZdxxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylZdxx 实例对象
     * @return 实例对象
     */
    @Override
    public YlZdxx insert(YlZdxx ylZdxx) {
        this.ylZdxxDao.insert(ylZdxx);
        return ylZdxx;
    }

    /**
     * 修改数据
     *
     * @param ylZdxx 实例对象
     * @return 实例对象
     */
    @Override
    public YlZdxx update(YlZdxx ylZdxx) {
        this.ylZdxxDao.update(ylZdxx);
        return this.queryById(ylZdxx.getRid());
    }

    /**
     * 通过主键删除数据
     *
     * @param rid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long rid) {
        return this.ylZdxxDao.deleteById(rid) > 0;
    }
}