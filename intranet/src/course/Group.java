package course;
import java.util.*;
import enums.*;
import users.*;

public class Group {
    private Teacher teacher;
    private int time;
    private int room;
    private Vector<Student> Students;
    private Map<Student, Mark> marks;
    private Map<Student, Attendance> attendance;
}
