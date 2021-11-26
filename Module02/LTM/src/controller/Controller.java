package controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.bean.Account;

/**
 * @author Tran Ngoc Huy
 *
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession session;
	model.bean.Account author;

	public Controller() {
		super();
	}

	void getAuthor(HttpServletRequest request) {
		session = request.getSession();
		System.out.println("get author");
		try {
			author = new Account();
			author.setID((int) session.getAttribute("ID"));
			author.setUsername((String) session.getAttribute("username"));
			if (author.getID() == 0)
				removeAuthor(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void setAuthor(HttpServletRequest request) {
		session = request.getSession();
		System.out.println("set author");
		if (author != null) {
			session.setAttribute("ID", author.getID());
			session.setAttribute("username", author.getUsername());

		}
	}

	void removeAuthor(HttpServletRequest request) {
		session = request.getSession();
		session.removeAttribute("ID");
		session.removeAttribute("username");
		author = null;
		System.out.println("remove author");
	}
}
