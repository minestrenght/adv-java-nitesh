package pkg;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Put extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();//create new, if not exist
        Integer count = (Integer) session.getAttribute("count");//get count
        count = null == count ? 1 : count + 1;//set count 1, if not there else +1
        session.setAttribute("count", count);//set count
        resp.sendRedirect("get"); //invoke next servlet
    }
}
