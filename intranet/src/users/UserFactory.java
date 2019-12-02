package users;
import java.util.Vector;
import database.Database;

public class UserFactory {
	
	public static User getUser(String userType) {
		Vector <User> users = Database.getUsers();
		if (userType.equalsIgnoreCase("student")) {
			return new Student();	
		}
		else
		if (userType.equalsIgnoreCase("teacher")) {
			return new Teacher();
		}
		else
		if (userType.equalsIgnoreCase("OR")) {
			return new OR();	
		}
		if (userType.equalsIgnoreCase("Department")) {
			return new Department();
		}
		return null;
	}

}
