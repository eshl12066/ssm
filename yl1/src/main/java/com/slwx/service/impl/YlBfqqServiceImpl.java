package com.slwx.service.impl;

import com.slwx.entity.YlBfqq;
import com.slwx.dao.YlBfqqDao;
import com.slwx.service.YlBfqqService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlBfqq)表服务实现类
 *
 * @author makejava
 * @since 2019-10-23 16:41:17
 */
@Service("ylBfqqService")
public class YlBfqqServiceImpl implements YlBfqqService {
    @Resource
    private YlBfqqDao ylBfqqDao;

    /**
     * 通过ID查询单条数据
     *
     * @param qid 主键
     * @return 实例对象
     */
    @Override
    public YlBfqq queryById(Long qid) {
        return this.ylBfqqDao.queryById(qid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlBfqq> queryAllByLimit(int offset, int limit) {
        return this.ylBfqqDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylBfqq 实例对象
     * @return 实例对象
     */
    @Override
    public YlBfqq insert(YlBfqq ylBfqq) {
        this.ylBfqqDao.insert(ylBfqq);
        return ylBfqq;
    }

    /**
     * 修改数据
     *
     * @param ylBfqq 实例对象
     * @return 实例对象
     */
    @Override
    public YlBfqq update(YlBfqq ylBfqq) {
        this.ylBfqqDao.update(ylBfqq);
        return this.queryById(ylBfqq.getQid());
    }

    /**
     * 通过主键删除数据
     *
     * @param qid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long qid) {
        return this.ylBfqqDao.deleteById(qid) > 0;
    }
}