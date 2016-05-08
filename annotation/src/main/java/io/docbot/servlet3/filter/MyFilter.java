package io.docbot.servlet3.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: zhangxiang
 * Date: 16/5/8
 * Time: 下午7:33
 * To change this template use File | Settings | File Templates.
 */
@WebFilter(filterName = "myFilter", urlPatterns = "/*",
        initParams = {@WebInitParam(name = "msg", value = "hello world")},
        dispatcherTypes = {DispatcherType.REQUEST, DispatcherType.FORWARD})
public class MyFilter implements Filter {
    private String msg;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.msg = filterConfig.getInitParameter("msg");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println(this.msg);
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }
}
