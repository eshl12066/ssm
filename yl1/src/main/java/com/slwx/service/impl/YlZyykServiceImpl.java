package com.slwx.service.impl;

import com.slwx.entity.YlZyyk;
import com.slwx.dao.YlZyykDao;
import com.slwx.service.YlZyykService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlZyyk)表服务实现类
 *
 * @author makejava
 * @since 2019-10-23 16:41:23
 */
@Service("ylZyykService")
public class YlZyykServiceImpl implements YlZyykService {
    @Resource
    private YlZyykDao ylZyykDao;

    /**
     * 通过ID查询单条数据
     *
     * @param zyno 主键
     * @return 实例对象
     */
    @Override
    public YlZyyk queryById(Long zyno) {
        return this.ylZyykDao.queryById(zyno);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlZyyk> queryAllByLimit(int offset, int limit) {
        return this.ylZyykDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylZyyk 实例对象
     * @return 实例对象
     */
    @Override
    public YlZyyk insert(YlZyyk ylZyyk) {
        this.ylZyykDao.insert(ylZyyk);
        return ylZyyk;
    }

    /**
     * 修改数据
     *
     * @param ylZyyk 实例对象
     * @return 实例对象
     */
    @Override
    public YlZyyk update(YlZyyk ylZyyk) {
        this.ylZyykDao.update(ylZyyk);
        return this.queryById(ylZyyk.getZyno());
    }

    /**
     * 通过主键删除数据
     *
     * @param zyno 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long zyno) {
        return this.ylZyykDao.deleteById(zyno) > 0;
    }
}