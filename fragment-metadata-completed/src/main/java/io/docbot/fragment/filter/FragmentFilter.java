package io.docbot.fragment.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: zhangxiang
 * Date: 16/5/8
 * Time: 下午10:17
 * To change this template use File | Settings | File Templates.
 */
public class FragmentFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
       System.out.println("FragmentFilter dofilter");
       chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
