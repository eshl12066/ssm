package com.slwx.service.impl;

import com.slwx.entity.YlZxyk;
import com.slwx.dao.YlZxykDao;
import com.slwx.service.YlZxykService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlZxyk)表服务实现类
 *
 * @author makejava
 * @since 2019-10-24 16:21:21
 */
@Service("ylZxykService")
public class YlZxykServiceImpl implements YlZxykService {
    @Resource
    private YlZxykDao ylZxykDao;

    /**
     * 通过ID查询单条数据
     *
     * @param yno 主键
     * @return 实例对象
     */
    @Override
    public YlZxyk queryById(Long yno) {
        return this.ylZxykDao.queryById(yno);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlZxyk> queryAllByLimit(int offset, int limit) {
        return this.ylZxykDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylZxyk 实例对象
     * @return 实例对象
     */
    @Override
    public YlZxyk insert(YlZxyk ylZxyk) {
        this.ylZxykDao.insert(ylZxyk);
        return ylZxyk;
    }

    /**
     * 修改数据
     *
     * @param ylZxyk 实例对象
     * @return 实例对象
     */
    @Override
    public YlZxyk update(YlZxyk ylZxyk) {
        this.ylZxykDao.update(ylZxyk);
        return this.queryById(ylZxyk.getYno());
    }

    /**
     * 通过主键删除数据
     *
     * @param yno 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long yno) {
        return this.ylZxykDao.deleteById(yno) > 0;
    }
}