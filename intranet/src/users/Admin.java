package users;
import java.util.Vector;

public class Admin extends User {
	private Vector<User> users;
	public Admin() {super();}
	public Admin(int userId, String login, String password, String firstName, String lastName, Vector<User> users) {
		super(userId, login, password, firstName, lastName);
		this.users = users;
	}
	
	//code
	public void addUser(String type, String firstName, String lastName) {
	}
	public void removeUser(int userId) {
	}
	public void updateUser(int userId) {
	}
	public void getUserInfo(int userId) {
	}
	public void seeLogFiles() {
	}
	public void showUsers() {
	}
	//end
	
	public Vector<User> getUsers() {
		return users;
	}
	public void setUsers(Vector<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Admin [users=" + users + ", UserId=" + getUserId() + ", FirstName=" + getFirstName()
				+ ", LastName=" + getLastName() + "]";
	}
	
	
}

