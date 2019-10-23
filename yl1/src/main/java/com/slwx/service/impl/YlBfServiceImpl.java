package com.slwx.service.impl;

import com.slwx.entity.YlBf;
import com.slwx.dao.YlBfDao;
import com.slwx.service.YlBfService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlBf)表服务实现类
 *
 * @author makejava
 * @since 2019-10-23 16:41:17
 */
@Service("ylBfService")
public class YlBfServiceImpl implements YlBfService {
    @Resource
    private YlBfDao ylBfDao;

    /**
     * 通过ID查询单条数据
     *
     * @param bfid 主键
     * @return 实例对象
     */
    @Override
    public YlBf queryById(Long bfid) {
        return this.ylBfDao.queryById(bfid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlBf> queryAllByLimit(int offset, int limit) {
        return this.ylBfDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylBf 实例对象
     * @return 实例对象
     */
    @Override
    public YlBf insert(YlBf ylBf) {
        this.ylBfDao.insert(ylBf);
        return ylBf;
    }

    /**
     * 修改数据
     *
     * @param ylBf 实例对象
     * @return 实例对象
     */
    @Override
    public YlBf update(YlBf ylBf) {
        this.ylBfDao.update(ylBf);
        return this.queryById(ylBf.getBfid());
    }

    /**
     * 通过主键删除数据
     *
     * @param bfid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long bfid) {
        return this.ylBfDao.deleteById(bfid) > 0;
    }
}