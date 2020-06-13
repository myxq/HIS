package com.ssmhis.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author 李永庆
 * @since 2019/8/25
 */
@WebListener
public class MyAppListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        sce.getServletContext().setAttribute("ctx",sce.getServletContext().getContextPath());
    }
}
