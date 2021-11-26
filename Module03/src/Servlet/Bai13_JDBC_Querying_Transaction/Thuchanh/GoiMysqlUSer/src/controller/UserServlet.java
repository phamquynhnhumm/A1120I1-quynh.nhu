package controller;

import model.User;
import service.UserService;
import service.UserServicelmpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserServlet", urlPatterns = {"/user",""})
public class UserServlet extends HttpServlet {
    private UserService service = new UserServicelmpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null)
        {
            action="";
        }
        System.out.println("xin chao");
        switch (action)
        {
            case "create":
                CreateUser(request,response);
                break;
            case "edit":
                EditUser(request,response);
                break;
            case "delete":
                DeleteUser(request,response);
                break;
            case "search":
                SearchUser(request,response);
                break;
            default:
                ListUser(request,response);
        }

    }

    private void SearchUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        System.out.println("đang tìm kiếm");
        request.setAttribute("user",service.finById(name));
        RequestDispatcher dispatcher= request.getRequestDispatcher("/user/search.jsp");
        dispatcher.forward(request,response);
    }

    private void DeleteUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ListUser(request,response);
    }

    private void EditUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email=  request.getParameter("email");
        String country = request.getParameter("country");
        int id= Integer.parseInt(request.getParameter("id"));
        User user = new User(name,email,country);
        System.out.println("đã luu thành công");
        System.out.println("usermowis  :" + id);
        System.out.println("usermowis  :" + name);
        System.out.println("usermowis  :" + email);
        System.out.println("usermowis  :" + country);
        service.update(id,user);
        ListUser(request,response);
    }

    private void CreateUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email=  request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(name,email,country);
        System.out.println("đã luu thành công");
        service.insertUserstore(user);
        System.out.println("ten gmail cỏng" + name + email+country);
//        service.save(user);
        ListUser(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null)
        {
            action="";
        }
        switch (action)
        {
            case "create":
                showCreatrFrom(request,response);
                break;
            case "edit":
                showEditFrom(request,response);
                break;
            case "search":
                showsearchFrom(request,response);
                break;
            case "delete":
                showDeleteFrom(request,response);
                break;
            default:
                ListUser(request,response);
        }


    }

    private void showDeleteFrom(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
//        request.setAttribute("message","xóa thành công");
        service.remove(id);
        System.out.println("xóa thành công");
//        request.setAttribute("user",service);
        request.setAttribute("user",service.findAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/user/list.jsp");
        dispatcher.forward(request,response);
    }

    private void showsearchFrom(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setAttribute("namee",service.);
//        System.out.println("tìm kiếm 1");
//        RequestDispatcher dispatcher = request.getRequestDispatcher("/user/search.jsp");
//        dispatcher.forward(request,response);
        String name = request.getParameter("namee");
        System.out.println("đang tìm kiếm");
        request.setAttribute("user",service.finById(name));
        RequestDispatcher dispatcher= request.getRequestDispatcher("/user/search.jsp");
        dispatcher.forward(request,response);
    }

    private void ListUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("user",service.findAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/user/list.jsp");
        dispatcher.forward(request,response);
    }

    private void showEditFrom(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println("id la" + id);
        request.setAttribute("user",service.getUserById(id));
        User user = service.getUserById(id);
//        System.out.println("finbutId" +service.finById1(id));
        RequestDispatcher dispatcher = request.getRequestDispatcher("/user/edit.jsp");
        dispatcher.forward(request,response);
    }

    private void showCreatrFrom(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("user",service.findAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/user/create.jsp");
        dispatcher.forward(request,response);
    }
}
