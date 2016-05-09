package io.docbot.fragment.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: zhangxiang
 * Date: 16/5/9
 * Time: 下午3:52
 * To change this template use File | Settings | File Templates.
 */
public class FragmentFilter1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("FragmentFilter1 init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("FragmentFilter1 dofilter");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }
}
