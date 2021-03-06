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
            case "qg":
                timkiemUser(request,response);
                break;
         
            default:
                ListUser(request,response);
        }

    }

    private void timkiemUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String qg = request.getParameter("qg");
        System.out.println("tim kiem theo quoc gia qg" +qg);
        request.setAttribute("user",service.finByCountry(qg));
        RequestDispatcher dispatcher= request.getRequestDispatcher("/user/searchqg.jsp");
        dispatcher.forward(request,response);
    }
    private void SearchUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        System.out.println("??ang t??m ki???m ten" +name);

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
        System.out.println("???? luu th??nh c??ng");
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
        System.out.println("???? luu th??nh c??ng");
        service.save(user);
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
            case "qg":
                showsearchqgFrom(request,response);
                break;
            case "delete":
                showDeleteFrom(request,response);
                break;
            case "sort":
                showSortUser(request,response);
                break;
            default:
                ListUser(request,response);
        }


    }

    private void showSortUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        service.Sort();
        System.out.println("s???p x???p th??nh c??ng");
        request.setAttribute("user",service.Sort());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/user/list.jsp");
        dispatcher.forward(request,response);
    }

    private void showsearchqgFrom(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String qg = request.getParameter("qg");
        System.out.println("??ang t??m ki???m qg" +qg);
        request.setAttribute("user",service.finByCountry(qg));
        RequestDispatcher dispatcher= request.getRequestDispatcher("/user/searchqg.jsp");
        dispatcher.forward(request,response);
    }
    private void showsearchFrom(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name= request.getParameter("name");
        System.out.println("??ang t??m ki???m ten" +name);
        request.setAttribute("user",service.finById(name));
        RequestDispatcher dispatcher= request.getRequestDispatcher("/user/search.jsp");
        dispatcher.forward(request,response);
    }


    private void showDeleteFrom(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
//        request.setAttribute("message","x??a th??nh c??ng");
        service.remove(id);
        System.out.println("x??a th??nh c??ng");
//        request.setAttribute("user",service);
        request.setAttribute("user",service.findAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/user/list.jsp");
        dispatcher.forward(request,response);
    }


    private void ListUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("user",service.findAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/user/list.jsp");
        dispatcher.forward(request,response);
    }

    private void showEditFrom(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("user",service.finById1(id));
        User user = service.finById1(id);
        System.out.println("finbutId" +service.finById1(id));
        RequestDispatcher dispatcher = request.getRequestDispatcher("/user/edit.jsp");
        dispatcher.forward(request,response);
    }

    private void showCreatrFrom(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("user",service.findAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/user/create.jsp");
        dispatcher.forward(request,response);
    }
}
