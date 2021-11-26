import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TuDienServlet", urlPatterns = "/tu-dien")
public class TuDienServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> tudien = new HashMap<>();
        tudien.put("hello","xin chào");
        tudien.put("how","thế nào");
        tudien.put("book","quyển vở");
        tudien.put("computer","máy tính");

        String seach = request.getParameter("txtSearch");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        String result = tudien.get(seach);
        if(result != null)
        {
            writer.println("Word: " + seach);
            writer.println("Result: " + result);
        }else {
            writer.println("Not found");
    }
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
