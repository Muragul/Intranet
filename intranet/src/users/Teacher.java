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
}

