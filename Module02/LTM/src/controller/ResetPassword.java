package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Tran Ngoc Huy
 *
 */
@WebServlet("/reset-password")
public class ResetPassword extends Controller {
	private static final long serialVersionUID = 1L;
	private model.BO.Account bo = new model.BO.Account();

	public ResetPassword() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String password = request.getParameter("password");
		String comfirm = request.getParameter("comfirm");
		getAuthor(request);
		String message = bo.resetPassword(author, password, comfirm);
		String path = "/reset-password.jsp";
		request.setAttribute("message", message);
		getServletContext().getRequestDispatcher(path).forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
