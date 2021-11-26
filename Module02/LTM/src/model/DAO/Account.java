package model.DAO;

public class Account {
	public model.bean.Account signIn(String username, String password) {
		model.bean.Account account = new model.bean.Account();
		account.setID(123);
		account.setUsername(username);
		return account;
	}

	public String signUp(String username, String password) {
		return "";
	}

	public String update(model.bean.Account author, String password) {
		return null;
	}

	public model.bean.Account getAccount(model.bean.Account author) {
		model.bean.Account account = new model.bean.Account();
		account.setID(author.getID());
		account.setUsername(author.getUsername());
		account.setDescription("...");
		return account;
	}
}
