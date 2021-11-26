package model.bean;

public class Account {
	// modify in model.DAO
	private int ID;
	private String username;
	private String password;
	private String description;

	// modify in model.BO
	private Account author;

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		if (author.getID() == getID())
			return password;
		else
			return null;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
