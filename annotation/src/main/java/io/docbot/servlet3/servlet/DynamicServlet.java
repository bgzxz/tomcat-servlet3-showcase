package io.docbot.servlet3.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: zhangxiang
 * Date: 16/5/8
 * Time: 下午9:55
 * To change this template use File | Settings | File Templates.
 */
public class DynamicServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("DynamicServlet init " +this.getInitParameter("msg"));
    }

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        resp.getWriter().println("DynamicServlet");
    }
}
