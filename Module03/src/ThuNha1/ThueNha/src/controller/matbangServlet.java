package controller;

import common.validate;
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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;

@WebServlet(name = "matbangServlet", urlPatterns = {"/matbang",""})
public class matbangServlet extends HttpServlet {
    private  matbangService service = new matbangServicelmpl();
//    private validate validate = new validate();
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
            case "delete":
                DeleteMatbang(request,response);
                break;
            case "share":
                ShareMatbang(request,response);
                break;
            default:
                ListMatbang(request,response);

        }
    }

    private void ShareMatbang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String timkiem1 = request.getParameter("timkiem1");
        String timkiem2 = request.getParameter("timkiem2");
        String timkiem3 = request.getParameter("timkiem3");
        String loai = request.getParameter("gtriloai");
        int tang = Integer.parseInt(request.getParameter("giatrtang"));
        float gia = Float.parseFloat(request.getParameter("gtrigia"));
        System.out.println("gia tri" + loai +tang+ gia);
        System.out.println("gia trim dang tim kiem theo1 " + timkiem1);
        System.out.println("gia trim dang tim kiem theo 2" + timkiem2);
        System.out.println("gia trim dang tim kiem theo 3" + timkiem3);
        if(timkiem1 != null && timkiem2 != null && timkiem3 != null)
        {
            System.out.println("tìm kiem theo 3 gia trị");
            service.finByLoai_Gia_Tang(loai,gia,tang);
            if( service.finByLoai_Gia_Tang(loai,gia,tang) == null)
            {
                request.setAttribute("message1", "Không tìm thấy kết quả");
                RequestDispatcher dispatcher = request.getRequestDispatcher("/matbang/list.jsp");
                dispatcher.forward(request, response);
            }
            else
            {
                request.setAttribute("matbangs",service.finByLoai_Gia_Tang(loai,gia,tang));
                RequestDispatcher dispatcher= request.getRequestDispatcher("/matbang/list.jsp");
                dispatcher.forward(request,response);
            }
        }
        else if(timkiem1 != null && timkiem2 != null && timkiem3 == null)
        {
            System.out.println("tìm kiem theo loai va gia");
            service.finByLoai_Gia(loai,gia);
            if(  service.finByLoai_Gia(loai,gia)== null)
            {
                request.setAttribute("message1", "Không tìm thấy kết quả");
                RequestDispatcher dispatcher = request.getRequestDispatcher("/matbang/list.jsp");
                dispatcher.forward(request, response);
            }
            else
            {
                request.setAttribute("matbangs",service.finByLoai_Gia(loai,gia));
                RequestDispatcher dispatcher= request.getRequestDispatcher("/matbang/list.jsp");
                dispatcher.forward(request,response);
            }
        }
        else if(timkiem1 != null && timkiem2 == null && timkiem3 != null)
        {
            System.out.println("tìm kiem theo loai va tang");
            service.finByLoai_Tang(loai,tang);
            if( service.finByLoai_Tang(loai,tang) == null)
            {
                request.setAttribute("message1", "Không tìm thấy kết quả");
                RequestDispatcher dispatcher = request.getRequestDispatcher("/matbang/list.jsp");
                dispatcher.forward(request, response);
            }
            else
            {
                request.setAttribute("matbangs",  service.finByLoai_Tang(loai,tang));
                RequestDispatcher dispatcher= request.getRequestDispatcher("/matbang/list.jsp");
                dispatcher.forward(request,response);
            }
        }
        else if(timkiem1 == null && timkiem2 != null && timkiem3 != null)
        {
            System.out.println("tìm kiem theo gia va tang");
            service.finByGia_Tang(gia,tang);
            if( service.finByGia_Tang(gia,tang)== null)
            {
                request.setAttribute("message1", "Không tìm thấy kết quả");
                RequestDispatcher dispatcher = request.getRequestDispatcher("/matbang/list.jsp");
                dispatcher.forward(request, response);
            }
            else
            {
                request.setAttribute("matbangs", service.finByGia_Tang(gia,tang));
                RequestDispatcher dispatcher= request.getRequestDispatcher("/matbang/list.jsp");
                dispatcher.forward(request,response);
            }
        }
        else if(timkiem1 != null && timkiem2 == null && timkiem3 == null)
        {
            System.out.println("tìm kiem theo loai");
            service.finByLoai(loai);
            if( service.finByLoai(loai)== null)
            {
                request.setAttribute("message1", "Không tìm thấy kết quả");
                RequestDispatcher dispatcher = request.getRequestDispatcher("/matbang/list.jsp");
                dispatcher.forward(request, response);
            }
            else
            {
                request.setAttribute("matbangs",service.finByLoai(loai));
                RequestDispatcher dispatcher= request.getRequestDispatcher("/matbang/list.jsp");
                dispatcher.forward(request,response);
            }
        }
        else if(timkiem1 == null && timkiem2 != null && timkiem3 == null)
        {
            System.out.println("tìm kiem theo gia");
            service.finByGia(gia);
            if( service.finByGia(gia) == null)
            {
                request.setAttribute("message1", "Không tìm thấy kết quả");
                RequestDispatcher dispatcher = request.getRequestDispatcher("/matbang/list.jsp");
                dispatcher.forward(request, response);
            }
            else
            {
                request.setAttribute("matbangs", service.finByGia(gia) );
                RequestDispatcher dispatcher= request.getRequestDispatcher("/matbang/list.jsp");
                dispatcher.forward(request,response);
            }
        }
         if(timkiem1 == null && timkiem2 == null && timkiem3 != null)
        {
            System.out.println("tìm kiem theo tang");

            if( service.finByTang(tang) == null)
            {
                request.setAttribute("message1", "Không tìm thấy kết quả");
                RequestDispatcher dispatcher = request.getRequestDispatcher("/matbang/list.jsp");
                dispatcher.forward(request, response);
            }
            else
            {
                request.setAttribute("matbangs", service.finByTang(tang));
                RequestDispatcher dispatcher= request.getRequestDispatcher("/matbang/list.jsp");
                dispatcher.forward(request,response);
            }
        }
    }

    private void DeleteMatbang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        System.out.println("xoa id" + id);
        service.remove(id);
        List<Matbang> matbangs = service.finAll();
        request.setAttribute("matbangs", matbangs);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/matbang/list.jsp");
        dispatcher.forward(request, response);
    }

    private void EditMatbang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String trangthai = request.getParameter("trangthai");
        float dientich = Float.parseFloat(request.getParameter("dientich"));
        int tang  = Integer.parseInt(request.getParameter("tang"));
        String loai = request.getParameter("loai");
        float gia = Float.parseFloat(request.getParameter("gia"));
        String ngaybatdau = request.getParameter("ngaybatdau");
        String ngayketthuc = request.getParameter("ngayketthuc");

        Matbang matbang =  new Matbang(id,trangthai,dientich,tang,loai,gia,ngaybatdau,ngayketthuc);
        System.out.println("id sua la:" + matbang);
        service.update(id,matbang);
        ListMatbang(request,response);
    }

    private void CreateMatbang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String trangthai = request.getParameter("trangthai");
        float dientich = Float.parseFloat(request.getParameter("dientich"));
        int tang  = Integer.parseInt(request.getParameter("tang"));
        String loai = request.getParameter("loai");
        float gia = Float.parseFloat(request.getParameter("gia"));
        String ngaybatdau = request.getParameter("ngaybatdau");
        String ngayketthuc = request.getParameter("ngayketthuc");

        System.out.println("kieu ngay bat dau" + ngaybatdau);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date1 = LocalDate.parse(ngaybatdau , formatter);
        LocalDate date2 = LocalDate.parse(ngayketthuc, formatter);

        long elapsedDays = ChronoUnit.MONTHS.between(date1, date2);
        System.out.println(" so thang là :" + elapsedDays);
        if(elapsedDays > 6)
        {
            if(service.finByIdTrung(id) == true) // chưa có id
            {
                if (validate.ID(id) != null) {
                    request.setAttribute("messageid","Vui lòng nhập mã đúng định dạng");
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/matbang/create.jsp");
                    dispatcher.forward(request,response);
                }
                else
                {
                    Matbang matbang = new Matbang(id, trangthai, dientich, tang, loai, gia, ngaybatdau, ngayketthuc);
                    service.save(matbang);
                    ListMatbang(request, response);
                }
            }
            else
            {
                request.setAttribute("message","Mã mặt bằng vừa thêm đã tồn tại");
                RequestDispatcher dispatcher = request.getRequestDispatcher("/matbang/create.jsp");
                dispatcher.forward(request,response);
            }
            System.out.println(" gia tri nul hay không" + service.finByIdTrung(id));
            System.out.println("ngay bay dayu va ket tuc" + ngaybatdau + ngayketthuc);
        }
        else {
                request.setAttribute("messagengay","Ngày bắt đầu phải nhỏ hơn ngày kết thúc ít nhất 6 tháng");
                RequestDispatcher dispatcher = request.getRequestDispatcher("/matbang/create.jsp");
                dispatcher.forward(request,response);
        }
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
            case "delete":
                ShowDeleteMatbang(request,response);
                break;
            case "share":
                ShowShareMatbang(request,response);
                break;
            default:
                ListMatbang(request,response);
        }
    }
    private void ShowShareMatbang(HttpServletRequest request, HttpServletResponse response) {

    }

    private void ShowDeleteMatbang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        System.out.println("xoa id" + id);
        service.remove(id);
        List<Matbang> matbangs = service.finAll();
        request.setAttribute("matbangs", matbangs);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/matbang/list.jsp");
        dispatcher.forward(request, response);
    }

    private void ListMatbang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Matbang> matbangs = service.finAll();
        request.setAttribute("matbangs",matbangs);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/matbang/list.jsp");
        dispatcher.forward(request,response);
    }

    private void ShowEditMatbang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String id = request.getParameter("id");
        request.setAttribute("matbang",service.finById(id));
        System.out.println("id là :" + id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/matbang/edit.jsp");
        dispatcher.forward(request,response);
    }

    private void ShowCreateMatbang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("matbang", service.finAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/matbang/create.jsp");
        dispatcher.forward(request,response);
    }
}
