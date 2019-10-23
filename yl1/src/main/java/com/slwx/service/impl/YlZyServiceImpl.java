package com.slwx.service.impl;

import com.slwx.entity.YlZy;
import com.slwx.dao.YlZyDao;
import com.slwx.service.YlZyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlZy)表服务实现类
 *
 * @author makejava
 * @since 2019-10-23 16:41:23
 */
@Service("ylZyService")
public class YlZyServiceImpl implements YlZyService {
    @Resource
    private YlZyDao ylZyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param zyid 主键
     * @return 实例对象
     */
    @Override
    public YlZy queryById(Long zyid) {
        return this.ylZyDao.queryById(zyid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlZy> queryAllByLimit(int offset, int limit) {
        return this.ylZyDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylZy 实例对象
     * @return 实例对象
     */
    @Override
    public YlZy insert(YlZy ylZy) {
        this.ylZyDao.insert(ylZy);
        return ylZy;
    }

    /**
     * 修改数据
     *
     * @param ylZy 实例对象
     * @return 实例对象
     */
    @Override
    public YlZy update(YlZy ylZy) {
        this.ylZyDao.update(ylZy);
        return this.queryById(ylZy.getZyid());
    }

    /**
     * 通过主键删除数据
     *
     * @param zyid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long zyid) {
        return this.ylZyDao.deleteById(zyid) > 0;
    }
}