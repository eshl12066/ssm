package com.slwx.service.impl;

import com.slwx.entity.YlBflx;
import com.slwx.dao.YlBflxDao;
import com.slwx.service.YlBflxService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlBflx)表服务实现类
 *
 * @author makejava
 * @since 2019-10-23 16:41:17
 */
@Service("ylBflxService")
public class YlBflxServiceImpl implements YlBflxService {
    @Resource
    private YlBflxDao ylBflxDao;

    /**
     * 通过ID查询单条数据
     *
     * @param bflxid 主键
     * @return 实例对象
     */
    @Override
    public YlBflx queryById(Long bflxid) {
        return this.ylBflxDao.queryById(bflxid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlBflx> queryAllByLimit(int offset, int limit) {
        return this.ylBflxDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylBflx 实例对象
     * @return 实例对象
     */
    @Override
    public YlBflx insert(YlBflx ylBflx) {
        this.ylBflxDao.insert(ylBflx);
        return ylBflx;
    }

    /**
     * 修改数据
     *
     * @param ylBflx 实例对象
     * @return 实例对象
     */
    @Override
    public YlBflx update(YlBflx ylBflx) {
        this.ylBflxDao.update(ylBflx);
        return this.queryById(ylBflx.getBflxid());
    }

    /**
     * 通过主键删除数据
     *
     * @param bflxid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long bflxid) {
        return this.ylBflxDao.deleteById(bflxid) > 0;
    }
}