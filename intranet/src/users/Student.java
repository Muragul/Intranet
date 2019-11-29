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

    public void registerCourse(Course course) {
    }
    public void removeCourse(Course course) {
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
}

