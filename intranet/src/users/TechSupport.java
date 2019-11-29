package users;
import java.util.*;
import enums.*;
import report.*;
import course.*;

public class TechSupport extends Employee {
    private Vector<Order> orders;

	public TechSupport(int userId, String login, String password, String firstName, String lastName, double salary) {
		super(userId, login, password, firstName, lastName, salary);
	}

	public Vector<Order> getOrders() {
		return orders;
	}

	public void setOrders(Vector<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "TechSupport [orders=" + orders + ", Salary=" + getSalary() + ", UserId=" + getUserId()
				+ ", FirstName=" + getFirstName() + ", LastName=" + getLastName() + "]";
	}
    
    
}