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
@WebServlet("/sign-up")
public class SignUp extends Controller {
	private static final long serialVersionUID = 1L;
	private model.BO.Account bo = new model.BO.Account();

	public SignUp() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String comfirm = request.getParameter("comfirm");
		String message = bo.signUp(username, password, comfirm);
		String path = "/sign-up.jsp";
		request.setAttribute("message", message);
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
