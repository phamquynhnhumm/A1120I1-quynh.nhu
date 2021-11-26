package model.BO;

public class Account {
	model.DAO.Account dao = new model.DAO.Account();

	public model.bean.Account signIn(String username, String password) {
		if (username == null || password == null)
			return null;
		return dao.signIn(username, password);
	}

	public String signUp(String username, String password, String comfirm) {
		if (username == null || password == null || password != comfirm)
			return "";
		return dao.signUp(username, password);
	}

	public String resetPassword(model.bean.Account author, String password, String comfirm) {
		return dao.update(author, password);
	}

	public model.bean.Account getAccount(model.bean.Account author) {
		return dao.getAccount(author);
	}

}
