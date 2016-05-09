package io.docbot.servlet3.fragment.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: zhangxiang
 * Date: 16/5/8
 * Time: 下午10:20
 * To change this template use File | Settings | File Templates.
 */
public class FragmentServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("FragmentServlet init");
    }
    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        resp.getWriter().println("FragmentServlet");
    }
}
