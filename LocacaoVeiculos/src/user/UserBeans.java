package user;


public class UserBeans {
	// Properties
	private String name;
	private String password;
	
	// Initializers
	public UserBeans(String name, String pw) {
		setName(name);
		setPassword(pw);
	}

	// Getters & Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
