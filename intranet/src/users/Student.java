package users;
import enums.*;
import java.util.*;
import course.*;
import report.*;

public class Student extends User {
    private int studentId;
    private double gpa;
    public Gender gender;
    private String email;
    private String universityEmail;
    private String phoneNum;
    private String nationality;
    private Date birthDate;
    private Faculty faculty;
    private int yearOfStudy;
    private Vector<Course> courses;
    private Vector<Message> messages;
    private Set<Teacher> ratedTeachers;
    private Vector<Course> registeredCourses;
    public Student() {super();}
    public Student(int userId, String login, String password, String firstName, String lastName, int studentId,
			Gender gender, String email, String universityEmail, String phoneNum, String nationality, Date birthDate,
			Faculty faculty) {
		super(userId, login, password, firstName, lastName);
		this.studentId = studentId;
		this.gender = gender;
		this.email = email;
		this.universityEmail = universityEmail;
		this.phoneNum = phoneNum;
		this.nationality = nationality;
		this.birthDate = birthDate;
		this.faculty = faculty;
	}
    
	//code
    public void registerCourse(Course course) {
    	this.registeredCourses.add(course);
    }
    public void removeCourse(Course course) {
    	this.registeredCourses.remove(course);
    }
    public void viewFiles(Course course) {
    }
    public void viewTeacher(Course course) {
    }
    public void rateTeacher(Teacher teacher) {
    }
    public void viewMark(Course course) {
    }
    public void viewAttestation() {
    }
    public void viewTranscript() {
    }
    public void calculateGPA() {
    }
    public void calculateGPA(int year, Semester semester) {
    }
    public void sendRequest(Request request) {
    }
    public void viewCourse(Course course) {
    }
    //end
    
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
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
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	public int getYearOfStudy() {
		return yearOfStudy;
	}
	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}
	public Vector<Course> getCourses() {
		return courses;
	}
	public void setCourses(Vector<Course> courses) {
		this.courses = courses;
	}
	public Vector<Message> getMessages() {
		return messages;
	}
	public void setMessages(Vector<Message> messages) {
		this.messages = messages;
	}
	public Set<Teacher> getRatedTeachers() {
		return ratedTeachers;
	}
	public void setRatedTeachers(Set<Teacher> ratedTeachers) {
		this.ratedTeachers = ratedTeachers;
	}
	public Vector<Course> getRegisteredCourses() {
		return registeredCourses;
	}
	public void setRegisteredCourses(Vector<Course> registeredCourses) {
		this.registeredCourses = registeredCourses;
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
		Student other = (Student) obj;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", gpa=" + gpa + ", gender=" + gender + ", email=" + email
				+ ", universityEmail=" + universityEmail + ", phoneNum=" + phoneNum + ", nationality=" + nationality
				+ ", birthDate=" + birthDate + ", faculty=" + faculty + ", yearOfStudy=" + yearOfStudy
				+ ", FirstName=" + getFirstName() + ", LastName=" + getLastName() + "]";
	}
	
    
}

