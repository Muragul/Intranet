package users;
import java.util.Vector;
import database.Database;

public class Admin extends User {
	
	public Admin() {super();}
	public Admin(int userId, String login, String password, String firstName, String lastName) {
		super(userId, login, password, firstName, lastName);
	}
	
	public void addUser(String type, int id, String firstName, String lastName) {
		User user = UserFactory.getUser(type);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setUserId(id);
		Vector<User> temp = Database.getUsers();
		temp.add(user);	
		Database.setUsers(temp);
	}
	
	public void removeUser(int userId) {
		Vector<User> temp = Database.getUsers();
		for (User u: temp) {
			if (u.getUserId() == userId) {
				temp.remove(u);
			}
		}
		Database.setUsers(temp);
	}
	
	public void updateUser(int userId) {
		
	}
	
	public String getUserInfo(int userId) {
		for (User u: Database.getUsers())
			if (u.getUserId() == userId)
				return u.toString();
		return null;
	}
	
	public void seeLogFiles() {
		
	}
	//end

	@Override
	public String toString() {
		return "Admin [UserId=" + getUserId() + ", FirstName=" + getFirstName()
				+ ", LastName=" + getLastName() + "]";
	}
	
	
}

