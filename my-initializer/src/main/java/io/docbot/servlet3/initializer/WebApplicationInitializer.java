package io.docbot.servlet3.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created with IntelliJ IDEA.
 * User: zhangxiang
 * Date: 16/5/9
 * Time: 下午6:15
 * To change this template use File | Settings | File Templates.
 */
public interface WebApplicationInitializer {
    void onStartup(ServletContext servletContext) throws ServletException;
}
