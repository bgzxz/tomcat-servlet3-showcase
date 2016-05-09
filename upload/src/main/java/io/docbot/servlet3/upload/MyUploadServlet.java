package io.docbot.servlet3.upload;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: zhangxiang
 * Date: 16/5/9
 * Time: 下午7:30
 * To change this template use File | Settings | File Templates.
 */
@WebServlet(name = "myUploadServlet", urlPatterns = "/upload")
@MultipartConfig(
        maxFileSize = 1024 * 1024, maxRequestSize = 1024 * 1024 * 2, fileSizeThreshold = 1024 * 256)
public class MyUploadServlet extends HttpServlet {
    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        try {
            System.out.println(req.getParameter("name"));
            Collection<Part> parts = req.getParts();
            for (Part part : parts) {
                System.out.println("\n\n=========name:::" + part.getName());
                System.out.println("=========size:::" + part.getSize());
                System.out.println("=========content-type:::" + part.getContentType());
                System.out.println("=========header content-disposition:::" + part.getHeader("content-disposition"));
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

    }
}
