package io.docbot.fragment.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: zhangxiang
 * Date: 16/5/9
 * Time: 下午3:50
 * To change this template use File | Settings | File Templates.
 */
@WebFilter(filterName = "annotationFilter",urlPatterns = "/*")
public class AnnotationFilter1 implements Filter {
    public AnnotationFilter1(){
        System.out.println("AnnotationFilter1 new");
    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("AnnotationFilter1 init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("AnnotationFilter1 doFilter");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }
}
