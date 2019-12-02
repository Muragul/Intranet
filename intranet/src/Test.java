import course.*;
import database.*;
import enums.*;
import report.*;
import users.*;
import java.util.*;

public class Test {
	public static void main(String args[]) {
		Vector <User> users = new Vector <>();
		Student student1 = new Student(1,"student1","kbtu1111", "Muragul", "Muratbekova", 18, Gender.FEMALE, "muragulm@gmail.com", "m_muratbekova@kbtu.kz","87019810742","kazakh", new Date(30/06/2000), Faculty.FacultyOfInformationTechnologies);
		users.add(student1);
		Student student2 = new Student(2,"student2","kbtu1111", "Alisa", "Lebedeva", 18, Gender.FEMALE, "", "a_lebedeva@kbtu.kz","","russian", new Date(28/9/2000), Faculty.FacultyOfInformationTechnologies);
		users.add(student2);
		for (User u: users)
			System.out.println(u);
	}

}
