package io.docbot.fragment.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: zhangxiang
 * Date: 16/5/8
 * Time: 下午10:25
 * To change this template use File | Settings | File Templates.
 */
@WebFilter(filterName = "annotationFilter",urlPatterns = "/*")
public class AnnotationFilter implements Filter {
    public AnnotationFilter(){
        System.out.println("AnnotationFilter new");
    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("AnnotationFilter init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("AnnotationFilter doFilter");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }
}
