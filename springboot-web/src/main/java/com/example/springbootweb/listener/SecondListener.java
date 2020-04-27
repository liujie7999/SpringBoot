package com.example.springbootweb.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @Author liujie
 * @Date 2020/4/22 0:17
 * @Describe         监听器 整合Listener方式二
 */

public class SecondListener implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Second Listener init......");
    }
}
