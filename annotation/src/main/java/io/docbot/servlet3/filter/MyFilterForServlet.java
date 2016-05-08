package io.docbot.servlet3.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: zhangxiang
 * Date: 16/5/8
 * Time: 下午8:02
 * To change this template use File | Settings | File Templates.
 */
@WebFilter(filterName = "myFilterForServlet", servletNames = {"myServlet"})
public class MyFilterForServlet implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("do filter for myServlet");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }
}
