package users;
import report.*;
import java.util.*;

public abstract class Manager extends Employee {
	public Manager() {super();}
    public Manager(int userId, String login, String password, String firstName, String lastName, double salary) {
		super(userId, login, password, firstName, lastName, salary);
		// TODO Auto-generated constructor stub
	}
    
    //code
	public void postNews(News news) {
		User.news.add(news);
    }
    public String viewInfo(int id) {
    	for (User u: Admin.users)
    		if ((u instanceof Student) || (u instanceof Teacher))
    			return u.toString();
    	return "User Not Found";
    }
    public void SendMessage(Message message, Teacher teacher) {
    	Vector <Message> m = teacher.getMessages();
    	m.add(message);
    	teacher.setMessages(m);
    }
    public void SendMessage(Message message, Student student) {
    	Vector <Message> m = student.getMessages();
    	m.add(message);
    	student.setMessages(m);
    }
    public void sendOrder(Order order, TechSupport techSupport) {
    	TechSupport.orders.add(order);
    }
    //end
    
    
}

