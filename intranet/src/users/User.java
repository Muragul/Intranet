package users;
import enums.*;
import report.*;
import java.util.*;

public abstract class User {
    private int userId;
    private String login;
    private String password;
    private static Vector<News> news;
    private String firstName;
    private String lastName;

    public void authorize(String login, String password) {
    }
    public void logout() {
    }
    public void ChangePassword(String newPassword) {
    }
}
