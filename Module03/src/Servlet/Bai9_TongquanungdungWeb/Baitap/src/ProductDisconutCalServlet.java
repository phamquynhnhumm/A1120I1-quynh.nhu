import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDisconutCalServlet", urlPatterns = "/chiet_khau")
public class ProductDisconutCalServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float gia = Float.parseFloat(request.getParameter("gia"));
        float tyle= Float.parseFloat(request.getParameter("tyle"));

        float  chietkhau = (float) (gia*tyle* 0.001);

                PrintWriter writer = response.getWriter();
                writer.println("<html>");
                writer.println("<h2>Chiết khấu là :" + chietkhau +"</h2>");
                writer.println("</html>");

    }
}
