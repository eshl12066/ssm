package com.slwx.service.impl;

import com.slwx.entity.YlGysqq;
import com.slwx.dao.YlGysqqDao;
import com.slwx.service.YlGysqqService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlGysqq)表服务实现类
 *
 * @author makejava
 * @since 2019-10-24 16:21:11
 */
@Service("ylGysqqService")
public class YlGysqqServiceImpl implements YlGysqqService {
    @Resource
    private YlGysqqDao ylGysqqDao;

    /**
     * 通过ID查询单条数据
     *
     * @param gid 主键
     * @return 实例对象
     */
    @Override
    public YlGysqq queryById(Long gid) {
        return this.ylGysqqDao.queryById(gid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlGysqq> queryAllByLimit(int offset, int limit) {
        return this.ylGysqqDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylGysqq 实例对象
     * @return 实例对象
     */
    @Override
    public YlGysqq insert(YlGysqq ylGysqq) {
        this.ylGysqqDao.insert(ylGysqq);
        return ylGysqq;
    }

    /**
     * 修改数据
     *
     * @param ylGysqq 实例对象
     * @return 实例对象
     */
    @Override
    public YlGysqq update(YlGysqq ylGysqq) {
        this.ylGysqqDao.update(ylGysqq);
        return this.queryById(ylGysqq.getGid());
    }

    /**
     * 通过主键删除数据
     *
     * @param gid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long gid) {
        return this.ylGysqqDao.deleteById(gid) > 0;
    }
}