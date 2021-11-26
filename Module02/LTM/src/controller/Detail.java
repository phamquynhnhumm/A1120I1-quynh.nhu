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
@WebServlet("/")
public class Detail extends Controller {
	private static final long serialVersionUID = 1L;
	private model.BO.Account bo = new model.BO.Account();

	public Detail() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		getAuthor(request);
		if (author != null) {
			Account account = bo.getAccount(author);
			request.setAttribute("account", account);
			String path = "/detail.jsp";
			getServletContext().getRequestDispatcher(path).forward(request, response);
		} else
			response.sendRedirect("/CNW/sign-in");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
