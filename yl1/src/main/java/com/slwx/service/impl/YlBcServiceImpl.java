package com.slwx.service.impl;

import com.slwx.entity.YlBc;
import com.slwx.dao.YlBcDao;
import com.slwx.service.YlBcService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlBc)表服务实现类
 *
 * @author makejava
 * @since 2019-10-24 15:53:31
 */
@Service("ylBcService")
public class YlBcServiceImpl implements YlBcService {
    @Resource
    private YlBcDao ylBcDao;

    /**
     * 通过ID查询单条数据
     *
     * @param bcid 主键
     * @return 实例对象
     */
    @Override
    public YlBc queryById(Long bcid) {
        return this.ylBcDao.queryById(bcid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlBc> queryAllByLimit(int offset, int limit) {
        return this.ylBcDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylBc 实例对象
     * @return 实例对象
     */
    @Override
    public YlBc insert(YlBc ylBc) {
        this.ylBcDao.insert(ylBc);
        return ylBc;
    }

    /**
     * 修改数据
     *
     * @param ylBc 实例对象
     * @return 实例对象
     */
    @Override
    public YlBc update(YlBc ylBc) {
        this.ylBcDao.update(ylBc);
        return this.queryById(ylBc.getBcid());
    }

    /**
     * 通过主键删除数据
     *
     * @param bcid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long bcid) {
        return this.ylBcDao.deleteById(bcid) > 0;
    }
}