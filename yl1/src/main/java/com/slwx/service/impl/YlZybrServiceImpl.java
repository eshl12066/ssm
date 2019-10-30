package com.slwx.service.impl;

import com.slwx.entity.YlZybr;
import com.slwx.dao.YlZybrDao;
import com.slwx.service.YlZybrService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlZybr)表服务实现类
 *
 * @author makejava
 * @since 2019-10-24 16:21:21
 */
@Service("ylZybrService")
public class YlZybrServiceImpl implements YlZybrService {
    @Resource
    private YlZybrDao ylZybrDao;

    /**
     * 通过ID查询单条数据
     *
     * @param ihno 主键
     * @return 实例对象
     */
    @Override
    public YlZybr queryById(Long ihno) {
        return this.ylZybrDao.queryById(ihno);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlZybr> queryAllByLimit(int offset, int limit) {
        return this.ylZybrDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylZybr 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(YlZybr ylZybr) {
        int insert = this.ylZybrDao.insert(ylZybr);
        return insert;
    }

    /**
     * 修改数据
     *
     * @param ylZybr 实例对象
     * @return 实例对象
     */
    @Override
    public YlZybr update(YlZybr ylZybr) {
        this.ylZybrDao.update(ylZybr);
        return this.queryById(ylZybr.getIhno());
    }

    /**
     * 通过主键删除数据
     *
     * @param ihno 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long ihno) {
        return this.ylZybrDao.deleteById(ihno) > 0;
    }
}