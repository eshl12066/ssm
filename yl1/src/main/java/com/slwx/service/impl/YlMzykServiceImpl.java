package com.slwx.service.impl;

import com.slwx.entity.YlMzyk;
import com.slwx.dao.YlMzykDao;
import com.slwx.service.YlMzykService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlMzyk)表服务实现类
 *
 * @author makejava
 * @since 2019-10-24 16:21:11
 */
@Service("ylMzykService")
public class YlMzykServiceImpl implements YlMzykService {
    @Resource
    private YlMzykDao ylMzykDao;

    /**
     * 通过ID查询单条数据
     *
     * @param myno 主键
     * @return 实例对象
     */
    @Override
    public YlMzyk queryById(Long myno) {
        return this.ylMzykDao.queryById(myno);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlMzyk> queryAllByLimit(int offset, int limit) {
        return this.ylMzykDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylMzyk 实例对象
     * @return 实例对象
     */
    @Override
    public YlMzyk insert(YlMzyk ylMzyk) {
        this.ylMzykDao.insert(ylMzyk);
        return ylMzyk;
    }

    /**
     * 修改数据
     *
     * @param ylMzyk 实例对象
     * @return 实例对象
     */
    @Override
    public YlMzyk update(YlMzyk ylMzyk) {
        this.ylMzykDao.update(ylMzyk);
        return this.queryById(ylMzyk.getMyno());
    }

    /**
     * 通过主键删除数据
     *
     * @param myno 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long myno) {
        return this.ylMzykDao.deleteById(myno) > 0;
    }
}