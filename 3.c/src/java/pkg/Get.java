package pkg;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Get extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        Integer count = (Integer) req.getSession().getAttribute("count");
        if (null == count) {
            pw.println("Invalid session !");
        } else {
            pw.printf("You have visited for %d time(s)", count);
        }
        pw.println("<br/><a href='put'>Visit Again</a>");
        pw.close();
    }

}
