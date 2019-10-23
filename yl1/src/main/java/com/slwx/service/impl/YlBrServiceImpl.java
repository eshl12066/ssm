package com.slwx.service.impl;

import com.slwx.entity.YlBr;
import com.slwx.dao.YlBrDao;
import com.slwx.service.YlBrService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (YlBr)表服务实现类
 *
 * @author makejava
 * @since 2019-10-23 16:41:18
 */
@Service("ylBrService")
public class YlBrServiceImpl implements YlBrService {
    @Resource
    private YlBrDao ylBrDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pno 主键
     * @return 实例对象
     */
    @Override
    public YlBr queryById(Long pno) {
        return this.ylBrDao.queryById(pno);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<YlBr> queryAllByLimit(int offset, int limit) {
        return this.ylBrDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ylBr 实例对象
     * @return 实例对象
     */
    @Override
    public YlBr insert(YlBr ylBr) {
        this.ylBrDao.insert(ylBr);
        return ylBr;
    }

    /**
     * 修改数据
     *
     * @param ylBr 实例对象
     * @return 实例对象
     */
    @Override
    public YlBr update(YlBr ylBr) {
        this.ylBrDao.update(ylBr);
        return this.queryById(ylBr.getPno());
    }

    /**
     * 通过主键删除数据
     *
     * @param pno 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long pno) {
        return this.ylBrDao.deleteById(pno) > 0;
    }
}