package io.docbot.servlet3.listener;

import io.docbot.servlet3.filter.DynamicFilter;
import io.docbot.servlet3.servlet.DynamicServlet;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;

/**
 * Created with IntelliJ IDEA.
 * User: zhangxiang
 * Date: 16/5/8
 * Time: 下午9:10
 * To change this template use File | Settings | File Templates.
 */
@WebListener("myDynamicListener")
public class MyDynamicListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("myDynamicListener init");
        ServletContext sc = sce.getServletContext();
        //tomcat 7 [java.lang.IllegalArgumentException: Once the first ServletContextListener has been called,
        // no more ServletContextListeners may be added. ]
        //context.addListener("io.docbot.servlet3.listener.DynamicContextListener");
        FilterRegistration.Dynamic dynamicFilter = sc.addFilter("dynamicFilter", DynamicFilter.class);
        dynamicFilter.setInitParameter("msg", "dynamicFilter");
        dynamicFilter.addMappingForUrlPatterns(null,true,"/*");

        ServletRegistration.Dynamic dynamicServlet = sc.addServlet("dynamicServlet",DynamicServlet.class);
        dynamicServlet.setLoadOnStartup(1);
        dynamicServlet.addMapping("/dynamicServlet/*");
        dynamicServlet.setInitParameter("msg","dynamicServlet");

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
