package controller;

import mode.Khachhang;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "khachhangServlet" , urlPatterns = {"/hachhangList",""})
public class khachhangServlet extends HttpServlet {
    private static  List<Khachhang> khachhangList;
    static
    {
        khachhangList = new ArrayList<>();
        khachhangList.add( new Khachhang("pham thi quynh nhu","28-08-2000","thanh hóa","avatar_1.jpg"));
        khachhangList.add(new Khachhang("nguyễn thị nga","02-06-2000","sầm sơm","avatar_2.png"));
        khachhangList.add(new Khachhang("hoàng thị xoan","23-02-1999","nghệ an","avatar_3.jpg"));
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("key", khachhangList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/khachhang/khachhang.jsp");
        dispatcher.forward(request, response);
    }
}
