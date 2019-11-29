package users;
import java.util.*;
import enums.*;
import report.*;

public abstract class Manager extends Employee {
	public Manager() {super();}
    public Manager(int userId, String login, String password, String firstName, String lastName, double salary) {
		super(userId, login, password, firstName, lastName, salary);
		// TODO Auto-generated constructor stub
	}
    
    //code
	public void addNews(News news) {
    }
    public void viewInfo(int id) {
    }
    public void postNews(News news) {
    }
    public void SendMessage(Message message, Teacher teacher) {
    }
    public void SendMessage(Message message, Student student) {
    }
    public void sendOrder(Order order, TechSupport techSupport) {
    }
    //end
    
    
}

