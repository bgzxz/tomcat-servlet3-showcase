package io.docbot.servlet3.async;

import javax.servlet.AsyncContext;
import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * User: zhangxiang
 * Date: 16/5/9
 * Time: 下午8:33
 * To change this template use File | Settings | File Templates.
 */
@WebServlet(name = "asyncServlet1", urlPatterns = "/async1", asyncSupported = true)
public class AsyncServlet1 extends HttpServlet {

    private final ExecutorService executorService = Executors.newScheduledThreadPool(2);

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Connection", "Keep-Alive");
        resp.setContentType("text/html;charset=utf-8");

        PrintWriter out = resp.getWriter();
        out.write("hello async");
        out.write("<br/>");
        out.flush();
        //1、开启异步
        final AsyncContext asyncContext = req.startAsync();
        asyncContext.setTimeout(10L * 1000);
        asyncContext.addListener(new AsyncListener() {
            @Override
            public void onComplete(AsyncEvent event) throws IOException {
                System.out.println("Complete:" + event);
            }

            @Override
            public void onTimeout(AsyncEvent event) throws IOException {
                System.out.println("timeout:" + event);
                event.getAsyncContext().complete();
            }

            @Override
            public void onError(AsyncEvent event) throws IOException {
                System.out.println("Error:" + event);
            }

            @Override
            public void onStartAsync(AsyncEvent event) throws IOException {
                System.out.println("start:" + event);
            }
        });

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3L * 1000);
                    if (asyncContext.hasOriginalRequestAndResponse()) {
                        PrintWriter out = asyncContext.getResponse().getWriter();
                        out.write("over");
                        asyncContext.complete();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
