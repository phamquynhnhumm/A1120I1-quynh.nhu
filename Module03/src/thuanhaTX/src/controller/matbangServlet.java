package controller;

import model.Matbang;
import service.matbangService;
import service.matbangServicelmpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.IllegalCharsetNameException;
import java.util.List;

@WebServlet(name = "matbangServlet", urlPatterns = {"/matbang",""})
public class matbangServlet extends HttpServlet {
    private matbangService service = new matbangServicelmpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                CreateMatbang(request,response);
                break;
            case "edit":
                EditMatbang(request,response);
                break;
            case "search":
                SearchMatbang(request,response);
                break;
            default:
                ListMatbang(request,response);

        }
    }

    private void SearchMatbang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String tieuchi = request.getParameter("timkiem");
        String giatri = request.getParameter("giatri");

        if(tieuchi.equals("loai"))
        {
            System.out.println("đang tìm kiếm theo tieu chi: " +tieuchi);
            request.setAttribute("matbangs",service.finByLoai(giatri));
            System.out.println("loai tim kiem duojc la :" +service.finByLoai(giatri) );
        }
        else if (tieuchi.equals("gia"))
        {
            System.out.println("đang tìm kiếm theo tieu chi: " +tieuchi);
            request.setAttribute("matbangs", service.finByGia(giatri));
            System.out.println("loai gia dang tim kem" +service.finByGia(giatri) );
        }
        else if (tieuchi.equals("tang"))
        {
            System.out.println("đang tìm kiếm theo tieu chi: " +tieuchi);
            request.setAttribute("matbangs",service.finByTang(giatri));
            System.out.println("số tang dang tim kiem" + service.finByTang(giatri));
        }

        System.out.println("giá trị đang tim kiếm " + giatri);
        request.setAttribute("value_key", giatri);
        RequestDispatcher dispatcher= request.getRequestDispatcher("/matbang/list.jsp");
        dispatcher.forward(request,response);
    }

    private void EditMatbang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id_matbang = request.getParameter("id_matbang");
        String trangthai=request.getParameter("trangthai");
        Float dientich=Float.parseFloat(request.getParameter("dientich"));
        int tang= Integer.parseInt(request.getParameter("tang"));
        String loaimb =request.getParameter("loai");
        Float gia=Float.parseFloat(request.getParameter("gia"));
        String ngaybatdau= request.getParameter("ngaybatdau");
        String ngayketthuc =request.getParameter("ngayketthuc");
        Matbang matbang = new Matbang(id_matbang,trangthai,dientich,tang,loaimb,gia,ngaybatdau,ngayketthuc);
        service.update(id_matbang,matbang);
        ListMatbang(request,response);
    }

    private void CreateMatbang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id_matbang = request.getParameter("id_matbang");
        String trangthai=request.getParameter("trangthai");
        Float dientich=Float.parseFloat(request.getParameter("dientich"));
        int tang= Integer.parseInt(request.getParameter("tang"));
        String loaimb =request.getParameter("loai");
        Float gia=Float.parseFloat(request.getParameter("gia"));
        String ngaybatdau= request.getParameter("ngaybatdau");
        String ngayketthuc =request.getParameter("ngayketthuc");
        Matbang matbang = new Matbang(id_matbang,trangthai,dientich,tang,loaimb,gia,ngaybatdau,ngayketthuc);
        service.save(matbang);
        ListMatbang(request,response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                ShowCreateMatbang(request,response);
                break;
            case "edit":
                ShowEditMatbang(request,response);
                break;
            default:
                ListMatbang(request,response);
        }
    }

    private void ShowCreateMatbang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setAttribute("matbangs",matbangs);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/matbang/create.jsp");
        dispatcher.forward(request,response);
    }

    private void ShowEditMatbang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        System.out.println("id đang sửa là :" + id);
        request.setAttribute("matbangs",service.finById(id));
        RequestDispatcher dispatcher = request.getRequestDispatcher("/matbang/edit.jsp");
        dispatcher.forward(request,response);


    }

    private void ListMatbang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Matbang> matbangs = service.finAll();
        request.setAttribute("matbangs",matbangs);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/matbang/list.jsp");
        dispatcher.forward(request,response);
    }

}
