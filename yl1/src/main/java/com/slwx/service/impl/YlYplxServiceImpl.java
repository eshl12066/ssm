package com.slwx.service.impl;

import com.slwx.entity.YlYplx;
import com.slwx.dao.YlYplxDao;
import com.slwx.service.YlYplxService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlYplx)表服务实现类
 *
 * @author makejava
 * @since 2019-10-23 16:41:22
 */
@Service("ylYplxService")
public class YlYplxServiceImpl implements YlYplxService {
    @Resource
    private YlYplxDao ylYplxDao;

    /**
     * 通过ID查询单条数据
     *
     * @param ylxno 主键
     * @return 实例对象
     */
    @Override
    public YlYplx queryById(Long ylxno) {
        return this.ylYplxDao.queryById(ylxno);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlYplx> queryAllByLimit(int offset, int limit) {
        return this.ylYplxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylYplx 实例对象
     * @return 实例对象
     */
    @Override
    public YlYplx insert(YlYplx ylYplx) {
        this.ylYplxDao.insert(ylYplx);
        return ylYplx;
    }

    /**
     * 修改数据
     *
     * @param ylYplx 实例对象
     * @return 实例对象
     */
    @Override
    public YlYplx update(YlYplx ylYplx) {
        this.ylYplxDao.update(ylYplx);
        return this.queryById(ylYplx.getYlxno());
    }

    /**
     * 通过主键删除数据
     *
     * @param ylxno 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long ylxno) {
        return this.ylYplxDao.deleteById(ylxno) > 0;
    }
}