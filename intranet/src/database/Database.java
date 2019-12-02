package database;
import java.io.File;
import java.io.Serializable;
import java.util.Vector;
import course.Course;
import report.News;
import users.User;

public class Database implements Serializable, Cloneable {
	
	private static Vector<User> users;
	private static Vector<Course> courses;
	private static Vector<News> news;
	private File logFile; // THINK ABOUT LOG FILE
	
	//public static Vector<Course> coursesForRegistration;
	
	{
		users = new Vector<User>();
		courses = new Vector<Course>();
		logFile = new File("log.txt");
	}
	
	public Database() {
		
	}
	
	public static Vector<User> getUsers() {
		return users;
	}

	public static void setUsers(Vector<User> users) {
		Database.users = users;
	}

	public static Vector<Course> getCourses() {
		return courses;
	}

	public static void setCourses(Vector<Course> courses) {
		Database.courses = courses;
	}
	
	public boolean isValidUser(String login, String password) {
		for (User u : users) {
			if (u.getLogin().equals(login) && u.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	
}
