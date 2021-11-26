package controller;

import model.Customer;
import service.CustomerService;
import service.CustomerServicelmpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {"/customers",""})
public class CustomerServlet extends HttpServlet {


    private CustomerService customerService = new CustomerServicelmpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null)
        {
            action="";
        }
        switch (action)
        {
            case "create":
                createCustomer(request,response);
                break;
            case "edit":
                eidtCustomer(request,response);
                break;
            case "delete":
                deleteCustomer(request,response);
                break;
            case "view":
//                viewCustomer(request,response);
                break;
            default:
                break;
        }
    }
    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.customerService.finById(id);
        RequestDispatcher dispatcher ;
        System.out.println("xóa thành công");
        if(customer == null)
        {
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        }
        else {
            this.customerService.remove(id);
            request.setAttribute("message", "Đã xóa thành công");
            dispatcher = request.getRequestDispatcher("customer/delete.jsp");
        }
        try
        {
            dispatcher.forward(request,response);
            } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void eidtCustomer(HttpServletRequest request, HttpServletResponse response) {
     int id = Integer.parseInt(request.getParameter("id"));
        String name= request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer= this.customerService.finById(id);
        RequestDispatcher dispatcher;
        if(customer == null)
        {
            dispatcher= request.getRequestDispatcher("error-404.jsp");
        }
        else {
            customer.setName(name);
            customer.setEmail(email);
            customer.setAddress(address);
            this.customerService.update(id,customer);
            request.setAttribute("customer",customer);
            request.setAttribute("message","Cập nhật thành công");
            dispatcher= request.getRequestDispatcher("customer/edit.jsp");
        }
        try
        {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
        String name= request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");

        int id= (int) (Math.random()*1000);
        Customer customer = new Customer(id, name, email, address);
        this.customerService.save(customer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/create.jsp");
        request.setAttribute("message", "thêm khách hàng mới thành công");
        try{
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
                showCreateForm(request,response);
                break;
            case "edit":
               showEditForm(request,response);
                break;
            case "delete":
                showDeleteForm(request,response);
                break;
            case "view":
                showViewForm(request,response);
                break;
            default:
                listCustomer(request,response);
                break;
        }
    }

    private void showViewForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.customerService.finById(id);
        RequestDispatcher dispatcher;
        if (customer == null) {
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("customer", customer);
            dispatcher = request.getRequestDispatcher("customer/view.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.customerService.finById(id);
        RequestDispatcher dispatcher;
        if (customer == null) {
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("customer", customer);
            dispatcher = request.getRequestDispatcher("customer/delete.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
        private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int id= Integer.parseInt(request.getParameter("id"));
        Customer customer= this.customerService.finById(id);
        RequestDispatcher dispatcher;
        if(customer == null)
        {
            dispatcher= request.getRequestDispatcher("error-404.jsp");
        }
        else {
            request.setAttribute("customer",customer);
            dispatcher = request.getRequestDispatcher("customer/edit.jsp");
        }
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher= request.getRequestDispatcher("customer/create.jsp");
        try{
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void listCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customers = this.customerService.findAll();
        request.setAttribute("customers",customers);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/list.jsp");
        try
        {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
