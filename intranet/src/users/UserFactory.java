package users;

public class UserFactory {
	
	public User getUser(String userType) {
		if (userType==null)return null;
		if (userType.equalsIgnoreCase("student"))
			return new Student();
		else
		if (userType.equalsIgnoreCase("teacher"))
			return new Teacher();
		else
		if (userType.equalsIgnoreCase("OR"))
			return new OR();
		if (userType.equalsIgnoreCase("Department"))
			return new Department();
		return null;
	}

}
