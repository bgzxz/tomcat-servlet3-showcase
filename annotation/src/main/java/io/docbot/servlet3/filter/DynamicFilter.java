package io.docbot.servlet3.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: zhangxiang
 * Date: 16/5/8
 * Time: 下午9:41
 * To change this template use File | Settings | File Templates.
 */
public class DynamicFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("DynamicFilter init");
        System.out.println("DynamicFilter msg " + filterConfig.getInitParameter("msg"));
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("DynamicFilter filter");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }
}
