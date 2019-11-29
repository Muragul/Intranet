package users;
import java.util.*;
import enums.*;
import report.*;
import course.*;

public class OR extends Manager {
	
	private static Vector<Request> requests;
	public OR() {super();}
	public OR(int userId, String login, String password, String firstName, String lastName, double salary) {
		super(userId, login, password, firstName, lastName, salary);
	}
	//code
	public void addCourseToRegistration(Course course) {
	}
	public void approveRegistration() {
	}
	//end
	
	public Vector<Request> getRequests() {
		return requests;
	}
	public void setRequests(Vector<Request> requests) {
		this.requests = requests;
	}
	
	
}

