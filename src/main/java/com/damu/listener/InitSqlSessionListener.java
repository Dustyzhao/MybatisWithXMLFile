package com.damu.listener;

import com.damu.utils.SqlSessionFactoryUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 监听器实现相关功能要实现ServletContextListener接口，要添加依赖javax.servlet-api
 * @author DUSTY
 */
@WebListener
public class InitSqlSessionListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("容器加载中...");
        // 初始化我们的SqlSesionFactory对象
        SqlSessionFactoryUtils.initSqlSessionFactry();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("容器销毁中...");
        // 关闭SqlSession对象
        SqlSessionFactoryUtils.close();
    }
}
