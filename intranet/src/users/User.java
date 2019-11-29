package users;
import report.*;
import java.util.*;

public abstract class User {
    private int userId;
    private String login;
    private String password;
    private static Vector<News> news;
    private String firstName;
    private String lastName;
    
    public User() {
    	
    }
    public User(int userId, String login, String password, String firstName, String lastName) {
		super();
		this.userId = userId;
		this.login = login;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}
    public User(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	//code
	public boolean authorize(String login, String password) {
    	if (this.login.equals(login) && this.password.equals(password))return true;
    	return false;
    }
    public void logout() {
    }
    public void ChangePassword(String newPassword) {
    	this.password = newPassword;
    }
    //end
    
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Vector<News> getNews() {
		return news;
	}
	
	public void setNews(Vector<News> news) {
		this.news = news;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + userId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	
}
