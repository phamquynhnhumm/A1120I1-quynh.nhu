import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servletdanghap", urlPatterns = "/dangnhap")
public class Servletdanghap extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        String pass = request.getParameter("password");

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        if(user.equals("quynhnhu") && pass.equals("quynhnhu2809"))
        {
            writer.println("<h3>  Chao " + user  + "</h3>");
        }
        else {
            writer.println("<h4>ban da dang nhap that bai</h4>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        String pass = request.getParameter("password");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        if(user.equals("quynhnhu") && pass.equals("quynhnhu2809"))
        {
            writer.println("<h3>  Chao " + user  + "</h3>");
        }
        else {
            writer.println("<h4>ban da dang nhap that bai</h4>");
        }

    }
}
