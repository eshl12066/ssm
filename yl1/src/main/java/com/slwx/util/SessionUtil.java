package com.slwx.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author 小李飞刀
 * @site www.javaxl.com
 * @company xxx公司
 * @create  2018-12-10 21:59
 */
public class SessionUtil {
    private static SqlSessionFactory sessionFactory;
    private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<SqlSession>();
    static {
        sessionFactory = new SqlSessionFactoryBuilder().build(SessionUtil.class.getResourceAsStream("/mybatis.cfg.xml"));
    }

    public static SqlSession openSession() {
        SqlSession session = threadLocal.get();
        if (null == session) {
            session = sessionFactory.openSession();
            threadLocal.set(session);
        }
        return session;
    }

    public static void main(String[] args) {
        SqlSession session = openSession();
        System.out.println(session.getConnection());
        session.close();
//        System.out.println(session.getConnection());
    }
}

