package user;
import java.util.Dictionary;
import java.util.HashMap;


public class UserDAO {
	// Properties
//	private ArrayList<UserBeans> users;
	private HashMap<String, String> users;
	
	// Initializers
	public UserDAO() {
		signup(new UserBeans("Paulo", "12345A"));
		signup(new UserBeans("Paulo56", "345X12"));
		signup(new UserBeans("John316", "onzeonze"));
	}
	
	// Getters & Setter
	public HashMap<String, String> getUsers() {
		return users;
	}

	public void signup(UserBeans user) {
		this.users.put(user.getName(), user.getPassword());
		this.users.containsKey(key)
	}
}
