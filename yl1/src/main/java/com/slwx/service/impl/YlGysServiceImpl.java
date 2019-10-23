package com.slwx.service.impl;

import com.slwx.entity.YlGys;
import com.slwx.dao.YlGysDao;
import com.slwx.service.YlGysService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlGys)表服务实现类
 *
 * @author makejava
 * @since 2019-10-23 16:41:18
 */
@Service("ylGysService")
public class YlGysServiceImpl implements YlGysService {
    @Resource
    private YlGysDao ylGysDao;

    /**
     * 通过ID查询单条数据
     *
     * @param gid 主键
     * @return 实例对象
     */
    @Override
    public YlGys queryById(Long gid) {
        return this.ylGysDao.queryById(gid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlGys> queryAllByLimit(int offset, int limit) {
        return this.ylGysDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylGys 实例对象
     * @return 实例对象
     */
    @Override
    public YlGys insert(YlGys ylGys) {
        this.ylGysDao.insert(ylGys);
        return ylGys;
    }

    /**
     * 修改数据
     *
     * @param ylGys 实例对象
     * @return 实例对象
     */
    @Override
    public YlGys update(YlGys ylGys) {
        this.ylGysDao.update(ylGys);
        return this.queryById(ylGys.getGid());
    }

    /**
     * 通过主键删除数据
     *
     * @param gid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long gid) {
        return this.ylGysDao.deleteById(gid) > 0;
    }
}