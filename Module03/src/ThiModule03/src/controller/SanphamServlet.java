package controller;

import model.Loai;
import model.Sanpham;
import service.LoaiService;
import service.LoaiServicelmpl;
import service.SanphamService;
import service.SanphamServicelmpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SanphamServlet", urlPatterns = {"/sanpham",""})
public class SanphamServlet extends HttpServlet {
    private SanphamService service = new SanphamServicelmpl();
    private LoaiService loaiService = new LoaiServicelmpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if(action == null)
        {
            action="";
        }
        switch (action)
        {           
            case "create":
                 CreateSanpham(request,response);
            break;
            case "edit":
                EditSanpham(request,response);
                break;
            case "srearch":
                SearchSanpham(request,response);
                break;
            case "delete":
                DeleteSanpham(request,response);
                break;
            default:
                ListSanpham(request,response);
        }
    }

    private void CreateSanpham(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ten_sp =request.getParameter("ten");
        float gia =Float.parseFloat(request.getParameter("gia"));
        int soluong = Integer.parseInt(request.getParameter("soluong"));
        String mausac =request.getParameter("mausac");
        String mota = request.getParameter("mota");
        String id_loai =request.getParameter("loai");
//        sanpham = new Sanpham(id,ten_sp,gia,soluong,mausac,mota, new Loai(ten_loai));
//        sanphamList.add(sanpham);
        Sanpham sanpham = new Sanpham(ten_sp ,gia,soluong,mausac,mota, new Loai(id_loai));
        service.save(sanpham);
        ListSanpham(request,response);
    }

    private void EditSanpham(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String ten_sp =request.getParameter("ten");
        float gia =Float.parseFloat(request.getParameter("gia"));
        int soluong = Integer.parseInt(request.getParameter("soluong"));
        String mausac =request.getParameter("mausac");
        String mota = request.getParameter("mota");
        String id_loai =request.getParameter("loai");
        Sanpham sanpham = new Sanpham(ten_sp ,gia,soluong,mausac,mota, new Loai(id_loai));
        System.out.println(" id dang sua sp   laf laf bn" + id );
        service.update(id,sanpham);
        ListSanpham(request,response);
    }

    private void SearchSanpham(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name= request.getParameter("name");
        System.out.println("đang tìm kiếm ten111 : " +name);
        request.setAttribute("sanphams",service.finByName(name));
        RequestDispatcher dispatcher= request.getRequestDispatcher("/sanpham/list.jsp");
        dispatcher.forward(request,response);
    }

    private void DeleteSanpham(HttpServletRequest request, HttpServletResponse response) {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if(action == null)
        {
            action="";
        }
        switch (action)
        {
            case "create":
                showCreateSanpham(request,response);
                break;
            case "edit":
                showEditSanpham(request,response);
                break;
            case "srearch":
                showSearchSanpham(request,response);
                break;
            case "delete":
                showDeleteSanpham(request,response);
                break;
            case "view":
                showViewSanpham(request,response);
                break;
            default:
                ListSanpham(request,response);
        }
    }

    private void showCreateSanpham(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Loai> loais = loaiService.finAll();
     List<Sanpham> sanphams = service.finAll();
        request.setAttribute("loais",loais);
        request.setAttribute("sanphams",sanphams);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/sanpham/create.jsp");
        dispatcher.forward(request,response);
    }

    private void showEditSanpham(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println("id dang sua la:" + id);
        List<Loai> loais = loaiService.finAll();
        request.setAttribute("loais",loais);
        request.setAttribute("sanpham", service.finById1(id));
        RequestDispatcher dispatcher = request.getRequestDispatcher("/sanpham/edit.jsp");
        dispatcher.forward(request,response);
    }

    private void showSearchSanpham(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name= request.getParameter("name");
        System.out.println("đang tìm kiếm ten111 : " +name);
        request.setAttribute("sanphams",service.finByName(name));
        request.setAttribute("ten",name);
//        System.out.println("tim kiem duoc:" + service.finByName(name));
        RequestDispatcher dispatcher= request.getRequestDispatcher("/sanpham/list.jsp");
        dispatcher.forward(request,response);
    }

    private void showDeleteSanpham(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        service.remove(id);
        System.out.println("đã xóa nhan viên  " + id);
        ListSanpham(request,response);
    }

    private void showViewSanpham(HttpServletRequest request, HttpServletResponse response) {
    }

    private void ListSanpham(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("sanphams",service.finAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/sanpham/list.jsp");
        dispatcher.forward(request,response);
    }
}
