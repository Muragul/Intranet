package users;
import enums.*;
import java.util.*;
import course.*;
import report.*;

public class Teacher extends Employee {
    public Gender gender;
    private String email;
    private String universityEmail;
    private String phoneNum;
    private Date birthDate;
    private double averageRate;
    private Vector<Message> messages;
    private TeacherTitle title;
    private Vector<Course> courses;
    public Teacher() {super();}
	public Teacher(int userId, String login, String password, String firstName, String lastName, double salary,
			Gender gender, String email, String universityEmail, String phoneNum, Date birthDate, TeacherTitle title) {
		super(userId, login, password, firstName, lastName, salary);
		this.gender = gender;
		this.email = email;
		this.universityEmail = universityEmail;
		this.phoneNum = phoneNum;
		this.birthDate = birthDate;
		this.title = title;
	}
	
	//code
    public void uploadFile(Course course, CourseFile file) {
    }
    public void viewCourse(Course course) {
    }
    public void putMark(Course course, Student student, Mark mark) {
    }
    public void viewStudents(Course course) {
    }
    public void viewStudentInfo(Student student) {
    }
    public void sendRequest(Request request) {
    }
    public void sendOrder(Order order) {
    }
    //end

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUniversityEmail() {
		return universityEmail;
	}

	public void setUniversityEmail(String universityEmail) {
		this.universityEmail = universityEmail;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public double getAverageRate() {
		return averageRate;
	}

	public void setAverageRate(double averageRate) {
		this.averageRate = averageRate;
	}

	public Vector<Message> getMessages() {
		return messages;
	}

	public void setMessages(Vector<Message> messages) {
		this.messages = messages;
	}

	public TeacherTitle getTitle() {
		return title;
	}

	public void setTitle(TeacherTitle title) {
		this.title = title;
	}

	public Vector<Course> getCourses() {
		return courses;
	}

	public void setCourses(Vector<Course> courses) {
		this.courses = courses;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Teacher [gender=" + gender + ", email=" + email + ", universityEmail=" + universityEmail + ", phoneNum="
				+ phoneNum + ", birthDate=" + birthDate + ", averageRate=" + averageRate + ", title=" + title
				+ ", courses=" + courses + ", Salary=" + getSalary() + ", UserId=" + getUserId()
				+ ", FirstName=" + getFirstName() + ", LastName=" + getLastName() + "]";
	}
	
	
    
}

