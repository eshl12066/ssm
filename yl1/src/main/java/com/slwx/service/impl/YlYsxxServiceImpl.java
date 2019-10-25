package com.slwx.service.impl;

import com.slwx.entity.YlYsxx;
import com.slwx.dao.YlYsxxDao;
import com.slwx.service.YlYsxxService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlYsxx)表服务实现类
 *
 * @author makejava
 * @since 2019-10-24 16:21:21
 */
@Service("ylYsxxService")
public class YlYsxxServiceImpl implements YlYsxxService {
    @Resource
    private YlYsxxDao ylYsxxDao;

    /**
     * 通过ID查询单条数据
     *
     * @param dno 主键
     * @return 实例对象
     */
    @Override
    public YlYsxx queryById(Long dno) {
        return this.ylYsxxDao.queryById(dno);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlYsxx> queryAllByLimit(int offset, int limit) {
        return this.ylYsxxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylYsxx 实例对象
     * @return 实例对象
     */
    @Override
    public YlYsxx insert(YlYsxx ylYsxx) {
        this.ylYsxxDao.insert(ylYsxx);
        return ylYsxx;
    }

    /**
     * 修改数据
     *
     * @param ylYsxx 实例对象
     * @return 实例对象
     */
    @Override
    public YlYsxx update(YlYsxx ylYsxx) {
        this.ylYsxxDao.update(ylYsxx);
        return this.queryById(ylYsxx.getDno());
    }

    /**
     * 通过主键删除数据
     *
     * @param dno 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long dno) {
        return this.ylYsxxDao.deleteById(dno) > 0;
    }
}