package users;
import java.util.Vector;

public class Admin extends User {
	public static Vector<User> users;
	public Admin() {super();}
	public Admin(int userId, String login, String password, String firstName, String lastName, Vector<User> users) {
		super(userId, login, password, firstName, lastName);
		Admin.users = users;
	}
	
	//code
	public void addUser(String type, int id, String firstName, String lastName) {
		User user = UserFactory.getUser(type);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setUserId(id);
		users.add(user);		
	}
	public void removeUser(int userId) {
		for (User u: users)
			if (u.getUserId() == userId)
				users.remove(u);
	}
	public void updateUser(int userId) {
	}
	public String getUserInfo(int userId) {
		for (User u: users)
			if (u.getUserId() == userId)
				return u.toString();
		return null;
	}
	public void seeLogFiles() {
	}
	public void showUsers() {
		this.getUsers();
	}
	//end
	
	public Vector<User> getUsers() {
		return users;
	}
	public void setUsers(Vector<User> users) {
		Admin.users = users;
	}

	@Override
	public String toString() {
		return "Admin [users=" + users + ", UserId=" + getUserId() + ", FirstName=" + getFirstName()
				+ ", LastName=" + getLastName() + "]";
	}
	
	
}

