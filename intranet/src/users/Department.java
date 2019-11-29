package users;
import java.util.*;
import enums.*;
import course.*;

public class Department extends Manager {
	public Faculty faculty;
	public Department() {super();}	
	public Department(int userId, String login, String password, String firstName, String lastName, double salary,
			Faculty faculty) {
		super(userId, login, password, firstName, lastName, salary);
		this.faculty = faculty;
	}
	
	//code
	public void createCourse(int id, Faculty faculty, int credits, String description, Vector<Integer> formula) {
	}
	public void assignTeacherToCourse(Teacher teacher, Course course) {
	}
	//end

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	@Override
	public String toString() {
		return "Department [faculty=" + faculty + ", Salary=" + getSalary() + ", UserId=" + getUserId()
				+ ", FirstName=" + getFirstName() + ", LastName=" + getLastName() + "]";
	}
	
	
}

