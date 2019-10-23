package com.slwx.service.impl;

import com.slwx.entity.YlLx;
import com.slwx.dao.YlLxDao;
import com.slwx.service.YlLxService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlLx)表服务实现类
 *
 * @author makejava
 * @since 2019-10-23 16:41:21
 */
@Service("ylLxService")
public class YlLxServiceImpl implements YlLxService {
    @Resource
    private YlLxDao ylLxDao;

    /**
     * 通过ID查询单条数据
     *
     * @param lxno 主键
     * @return 实例对象
     */
    @Override
    public YlLx queryById(Long lxno) {
        return this.ylLxDao.queryById(lxno);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlLx> queryAllByLimit(int offset, int limit) {
        return this.ylLxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylLx 实例对象
     * @return 实例对象
     */
    @Override
    public YlLx insert(YlLx ylLx) {
        this.ylLxDao.insert(ylLx);
        return ylLx;
    }

    /**
     * 修改数据
     *
     * @param ylLx 实例对象
     * @return 实例对象
     */
    @Override
    public YlLx update(YlLx ylLx) {
        this.ylLxDao.update(ylLx);
        return this.queryById(ylLx.getLxno());
    }

    /**
     * 通过主键删除数据
     *
     * @param lxno 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long lxno) {
        return this.ylLxDao.deleteById(lxno) > 0;
    }
}