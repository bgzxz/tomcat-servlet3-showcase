package io.docbot.servlet3.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: zhangxiang
 * Date: 16/5/8
 * Time: 下午7:55
 * To change this template use File | Settings | File Templates.
 */
@WebServlet(name = "myServlet", urlPatterns = "/hello",
        loadOnStartup = 1,
        initParams = {@WebInitParam(name = "msg", value = "hello world!"), @WebInitParam(name = "msg1", value = "hello servlet3")})
public class MyServlet extends HttpServlet {
    private String msg;

    private String msg1;

    public MyServlet() {
        System.out.println("load MyServlet!");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        msg = this.getInitParameter("msg");
        msg1 = this.getInitParameter("msg1");
    }

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println(msg);
        System.out.println(msg1);
    }

}
