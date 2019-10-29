package com.slwx.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.slwx.entity.YlGh;
import com.slwx.dao.YlGhDao;
import com.slwx.service.YlGhService;
import com.slwx.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (YlGh)表服务实现类
 *
 * @author makejava
 * @since 2019-10-24 16:21:11
 */
@Service
public class YlGhServiceImpl implements YlGhService {
    @Resource
    private YlGhDao ylGhDao;


    /**
     * 通过ID查询单条数据
     *
     * @param rno 主键
     * @return 实例对象
     */
    @Override
    public YlGh queryById(Long rno) {
        return this.ylGhDao.queryById(rno);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlGh> queryAllByLimit(int offset, int limit) {
        return this.ylGhDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylGh 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(YlGh ylGh) {
        return this.ylGhDao.insert(ylGh);
    }

    /**
     * 修改数据
     *
     * @param ylGh 实例对象
     * @return 实例对象
     */
    @Override
    public YlGh update(YlGh ylGh) {
        this.ylGhDao.update(ylGh);
        return this.queryById(ylGh.getRno());
    }

    /**
     * 通过主键删除数据
     *
     * @param rno 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long rno) {
        return this.ylGhDao.deleteById(rno) > 0;
    }

    //***********************GD
    @Override
    public List<Map> selectgetAllPager(YlGh ylGh, PageBean pageBean) {
        return ylGhDao.selectgetAll(ylGh);
    }


}