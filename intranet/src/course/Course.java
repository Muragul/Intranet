package course;
import enums.*;
import users.*;
import java.util.*;

public class Course {
	public String id;
	public Faculty faculty;
	public int credits;
	private int year;
	private Semester Semester;
	public Teacher teacher;
	private Map<Student, Mark> marks;
	public String name;
	private Vector<CourseFile> files;
	public String description;
	private Vector<Integer> formula;
	private Vector<Course> prerequesites;
	private Vector<Group> groups;
}

