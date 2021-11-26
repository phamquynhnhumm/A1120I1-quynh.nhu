package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.channels.FileLock;

@WebServlet(name = "ChuviServlet", urlPatterns = {"/chuvi",""})
public class ChuviServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String bk = request.getParameter("bankinh");
        if (bk.trim().equals("")) {
            request.setAttribute("message", "Vui lòng nhập bán kính! ");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/chuvi/tinh.jsp");
            dispatcher.forward(request, response);
        }
       else {
                System.out.println("bán kính nhập vào là :" + bk);
                float bkinh = Float.parseFloat(bk);
                float chuvi = (float) (bkinh * 2 * 3.14);
                request.setAttribute("chuvi", chuvi);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/chuvi/tinh.jsp");
                dispatcher.forward(request, response);
            }
        }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/chuvi/tinh.jsp");
        dispatcher.forward(request,response);
    }
}
