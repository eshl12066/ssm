package com.slwx.service.impl;

import com.slwx.dao.YlBxlxDao;
import com.slwx.entity.YlBxlx;
import com.slwx.service.YlBxlxService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlBxlx)表服务实现类
 *
 * @author makejava
 * @since 2019-10-24 16:21:11
 */
@Service("ylBxlxService")
public class YlBxlxServiceImpl implements YlBxlxService {
    @Resource
    private YlBxlxDao ylBxlxDao;

   /* *//**
     * 通过ID查询单条数据
     *
     * @param bno 主键
     * @return 实例对象
     *//*
    @Override
    public YlBxlx queryById(Long bno) {
        return this.ylBxlxDao.queryById(bno);
    }*/

    @Override
    public YlBxlx queryById(Long bno) {
        return null;
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlBxlx> queryAllByLimit(int offset, int limit) {
        return this.ylBxlxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylBxlx 实例对象
     * @return 实例对象
     */
    @Override
    public YlBxlx insert(YlBxlx ylBxlx) {
        this.ylBxlxDao.insert(ylBxlx);
        return ylBxlx;
    }

    /**
     * 修改数据
     *
     * @param ylBxlx 实例对象
     * @return 实例对象
     */
    @Override
    public YlBxlx update(YlBxlx ylBxlx) {
        this.ylBxlxDao.update(ylBxlx);
        return this.queryById(ylBxlx.getBno());
    }

    /**
     * 通过主键删除数据
     *
     * @param bno 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long bno) {
        return this.ylBxlxDao.deleteById(bno) > 0;
    }
}