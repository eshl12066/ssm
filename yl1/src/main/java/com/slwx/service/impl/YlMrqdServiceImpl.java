package com.slwx.service.impl;

import com.slwx.entity.YlMrqd;
import com.slwx.dao.YlMrqdDao;
import com.slwx.service.YlMrqdService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlMrqd)表服务实现类
 *
 * @author makejava
 * @since 2019-10-24 16:21:11
 */
@Service("ylMrqdService")
public class YlMrqdServiceImpl implements YlMrqdService {
    @Resource
    private YlMrqdDao ylMrqdDao;

    /**
     * 通过ID查询单条数据
     *
     * @param mrqdid 主键
     * @return 实例对象
     */
    @Override
    public YlMrqd queryById(Long mrqdid) {
        return this.ylMrqdDao.queryById(mrqdid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlMrqd> queryAllByLimit(int offset, int limit) {
        return this.ylMrqdDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylMrqd 实例对象
     * @return 实例对象
     */
    @Override
    public YlMrqd insert(YlMrqd ylMrqd) {
        this.ylMrqdDao.insert(ylMrqd);
        return ylMrqd;
    }

    /**
     * 修改数据
     *
     * @param ylMrqd 实例对象
     * @return 实例对象
     */
    @Override
    public YlMrqd update(YlMrqd ylMrqd) {
        this.ylMrqdDao.update(ylMrqd);
        return this.queryById(ylMrqd.getMrqdid());
    }

    /**
     * 通过主键删除数据
     *
     * @param mrqdid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long mrqdid) {
        return this.ylMrqdDao.deleteById(mrqdid) > 0;
    }
}