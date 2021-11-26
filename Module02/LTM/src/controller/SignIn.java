package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.Account;

/**
 * @author Tran Ngoc Huy
 *
 */
@WebServlet("/sign-in")
public class SignIn extends Controller {
	private static final long serialVersionUID = 1L;
	private model.BO.Account bo = new model.BO.Account();

	public SignIn() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Account result = bo.signIn(username, password);
		if (result != null) {
			this.author = result;
			setAuthor(request);
			response.sendRedirect("/CNW/");
		} else {
			String path = "/sign-in.jsp";
			getServletContext().getRequestDispatcher(path).forward(request, response);
		}

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
