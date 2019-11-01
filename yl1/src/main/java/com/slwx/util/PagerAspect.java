package com.slwx.util;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 *   第一个*代表返回类型不限
 *   第二个是*..代表任意包下
 *   *Service代表以Service结尾的类
 *   *Pager代表以Pager结尾的方法
 *
 *   只要调用这个方法，就能够达到分页效果
 *
 *   PageHelper.start();
 *   调用目标方法之前
 *   处理结果集
 *
 *   判断是否包含PageBea，包含才分页
 */
@Component
@Aspect
public class PagerAspect {
    @Around("execution(* *..*Service.*Pager(..))")
    public Object invoke(ProceedingJoinPoint args) throws Throwable{
//      判断符合条件的方法中是否包含pageBean参数
        Object[] params=args.getArgs();
        PageBean pageBean=null;
        for (Object param : params) {
            if(param instanceof PageBean){
                pageBean = (PageBean)param;
                break;
            }
        }

        if(pageBean != null && pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
        Object list = args.proceed(params);
        if(pageBean !=null && pageBean.isPagination()){
            PageInfo pageInfo=new PageInfo((List) list);
            pageBean.setTotal(pageInfo.getTotal()+"");
        }
        return list;
    }

}
