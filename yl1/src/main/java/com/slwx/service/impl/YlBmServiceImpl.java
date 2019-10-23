package com.slwx.service.impl;

import com.slwx.entity.YlBm;
import com.slwx.dao.YlBmDao;
import com.slwx.service.YlBmService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlBm)表服务实现类
 *
 * @author makejava
 * @since 2019-10-23 16:41:17
 */
@Service("ylBmService")
public class YlBmServiceImpl implements YlBmService {
    @Resource
    private YlBmDao ylBmDao;

    /**
     * 通过ID查询单条数据
     *
     * @param bmid 主键
     * @return 实例对象
     */
    @Override
    public YlBm queryById(Long bmid) {
        return this.ylBmDao.queryById(bmid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlBm> queryAllByLimit(int offset, int limit) {
        return this.ylBmDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylBm 实例对象
     * @return 实例对象
     */
    @Override
    public YlBm insert(YlBm ylBm) {
        this.ylBmDao.insert(ylBm);
        return ylBm;
    }

    /**
     * 修改数据
     *
     * @param ylBm 实例对象
     * @return 实例对象
     */
    @Override
    public YlBm update(YlBm ylBm) {
        this.ylBmDao.update(ylBm);
        return this.queryById(ylBm.getBmid());
    }

    /**
     * 通过主键删除数据
     *
     * @param bmid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long bmid) {
        return this.ylBmDao.deleteById(bmid) > 0;
    }
}