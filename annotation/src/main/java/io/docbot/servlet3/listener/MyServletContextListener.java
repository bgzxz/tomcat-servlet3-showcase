package io.docbot.servlet3.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created with IntelliJ IDEA.
 * User: zhangxiang
 * Date: 16/5/8
 * Time: 下午8:13
 * To change this template use File | Settings | File Templates.
 */
@WebListener("myWebContextListener")
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println(sce.getServletContext().getInitParameter("msg"));
        System.out.println(sce.getServletContext().getContextPath() + "context init");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println(sce.getServletContext().getContextPath() + "context destroy");
    }
}
