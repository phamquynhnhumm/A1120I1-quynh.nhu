package controller;

import model.Sanpham;
import repository.SanphamRepository;
import repository.SanphamRepositorylmpl;
import service.Sanphamservice;
import service.Sanphamservicelmpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SanphamServlet" , urlPatterns = {"/sanpham",""})
public class SanphamServlet extends HttpServlet {
    private Sanphamservice sanphamservice = new Sanphamservicelmpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null)
        {
            action= "";
        }
        switch (action){
            case "create":
                createSanpham(request,response);
                break;
            case "edit":
                editSanpham(request,response);
                break;
            case "view":
                viewSanpham(request,response);
                break;
            case "delete":
                deleteSanpham(request,response);
                break;
            case "search":
                searchSanpham(request,response);
                break;
            default:
                ListSanpham(request,response);
                break;
        }
    }

    private void searchSanpham(HttpServletRequest request, HttpServletResponse response) {
        String ten = request.getParameter("ten");
        Sanphamservice sanphamservice = new Sanphamservicelmpl();
        List<Sanpham> sanphamList = sanphamservice.searchSanpham(ten);
        request.setAttribute("message","các sản phẩm dduojc tìm kiếm thấy");
        request.setAttribute("sanpham",sanphamList);
        System.out.println(sanphamList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/sanpham/search.jsp");
        try
        {
            requestDispatcher.forward(request,response);
            System.out.println("tìm kiếm thâyd");
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    private void deleteSanpham(HttpServletRequest request, HttpServletResponse response) {
        int id= Integer.parseInt(request.getParameter("id"));
        Sanpham sanpham = this.sanphamservice.finById(id);
        this.sanphamservice.remove(id);
        request.setAttribute("message","xóa sp thành công");
        request.setAttribute("sanpham",sanpham);
        RequestDispatcher dispatcher= request.getRequestDispatcher("/sanpham/delete.jsp");
        try
        {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void viewSanpham(HttpServletRequest request, HttpServletResponse response) {
    }
    private void editSanpham(HttpServletRequest request, HttpServletResponse response) {
       int id= Integer.parseInt(request.getParameter("id"));
        String ten = request.getParameter("ten");
        int gia = Integer.parseInt(request.getParameter("gia"));
        String mota = request.getParameter("mota");
        String nhasx = request.getParameter("nhasx");
       Sanpham sanpham= this.sanphamservice.finById(id);
       RequestDispatcher dispatcher;
      sanpham.setId(id);
      sanpham.setTen(ten);
      sanpham.setGia(gia);
      sanpham.setMota(mota);
      sanpham.setNhaxb(nhasx);
      this.sanphamservice.update(id,sanpham);
      request.setAttribute("message","chỉnh sửa thành công");
      request.setAttribute("sanpham",sanpham);
      dispatcher= request.getRequestDispatcher("/sanpham/eidt.jsp");
      try
      {
          dispatcher.forward(request,response);
      } catch (ServletException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      }
    }

    private void createSanpham(HttpServletRequest request, HttpServletResponse response) {
        String ten = request.getParameter("ten");
        int gia = Integer.parseInt(request.getParameter("gia"));
        String mota = request.getParameter("mota");
        String nhasx = request.getParameter("nhasx");
        int id = (int) (Math.random()*1000);
        Sanpham sanpham= new Sanpham(id,ten,gia,mota,nhasx);
        this.sanphamservice.save(sanpham);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/sanpham/create.jsp");
        request.setAttribute("massege","Đã thêm mới sản phẩm thành công");
        System.out.println("đã thêm sp");
        try
        {
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
            action= "";
        }
        switch (action)
            {
                case "create":
                    showCreateSanPham(request,response);
                    break;
                case "edit":
                    showEditSanpham(request,response);
                    break;
                case "view" :
                    showViewSanpham(request,response);
                    break;
                case "delete":
                    showDeleteSanpham(request,response);
                    break;
                case "search":
                    showSearchSanpham(request,response);
                    break;
                default:
                    ListSanpham(request,response);
                    break;
            }
        }


    private void showCreateSanPham(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("sanpham",sanphamservice.finAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("sanpham/create.jsp");
        try
        {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditSanpham(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Sanpham sanpham= this.sanphamservice.finById(id);
        RequestDispatcher dispatcher=  request.getRequestDispatcher("/sanpham/eidt.jsp");
        request.setAttribute("sanpham",sanpham);
        try
        {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showViewSanpham(HttpServletRequest request, HttpServletResponse response) {
        int id=Integer.parseInt(request.getParameter("id"));
       Sanpham sanpham =  this.sanphamservice.finById(id);
       RequestDispatcher dispatcher;
       request.setAttribute("sanpham",sanpham);
       dispatcher = request.getRequestDispatcher("/sanpham/view.jsp");
       try
       {
           dispatcher.forward(request,response);
       } catch (ServletException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
    }

    private void showDeleteSanpham(HttpServletRequest request, HttpServletResponse response) {
        int id=Integer.parseInt(request.getParameter("id"));
        Sanpham sanpham =  this.sanphamservice.finById(id);
        RequestDispatcher dispatcher;
        request.setAttribute("sanpham",sanpham);
        dispatcher = request.getRequestDispatcher("/sanpham/delete.jsp");
        try
        {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showSearchSanpham(HttpServletRequest request, HttpServletResponse response) {
    //    request.setAttribute("sanpham",sanphamservice.finAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/sanpham/search.jsp");
        System.out.println("dang tìm kiếm");
        try
        {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void ListSanpham(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("sanpham",sanphamservice.finAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/sanpham/list.jsp");
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
