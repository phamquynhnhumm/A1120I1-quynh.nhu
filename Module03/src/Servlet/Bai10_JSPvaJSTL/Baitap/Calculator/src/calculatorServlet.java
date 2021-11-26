import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "calculatorServlet" ,urlPatterns = "/calculator")
public class calculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("calculator/calculator.jsp");
        requestDispatcher.forward(request,response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        float soa = Float.parseFloat(request.getParameter("soa"));
        float soc = Float.parseFloat(request.getParameter("soc"));
        String tinh = request.getParameter("tinh");
        System.out.println(tinh);
        request.setAttribute("soa1",soa);
        request.setAttribute("soc1",soc);
        request.setAttribute("pheptinh",tinh);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("calculator/calculator.jsp");
        requestDispatcher.forward(request,response);

    }
}
