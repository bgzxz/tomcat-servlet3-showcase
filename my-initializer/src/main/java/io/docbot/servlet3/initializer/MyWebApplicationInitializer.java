package io.docbot.servlet3.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created with IntelliJ IDEA.
 * User: zhangxiang
 * Date: 16/5/9
 * Time: 下午6:16
 * To change this template use File | Settings | File Templates.
 */
public class MyWebApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println("MyWebApplicationInitializer");
        ServletRegistration.Dynamic myServlet = servletContext.addServlet("myServlet",MyServlet.class);
        myServlet.setLoadOnStartup(1);
        myServlet.addMapping("/myServlet/*");
    }
}
