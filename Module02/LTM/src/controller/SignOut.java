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
@WebServlet("/sign-out")
public class SignOut extends Controller {
	private static final long serialVersionUID = 1L;
	
	public SignOut() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		removeAuthor(request);
		response.sendRedirect("/CNW/sign-in");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
