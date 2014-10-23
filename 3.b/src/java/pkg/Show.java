package pkg;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Show extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        String color = req.getParameter("color");
        String msg = req.getParameter("msg");
        pw.printf("<font color='%s\'>", color);
        pw.printf("Color: %s, Message: %s", color, msg);
        pw.println("</font>");
        pw.close();
    }

}
