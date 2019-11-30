package course;
import java.util.*;
import users.*;

public class Group {
    public Teacher teacher;
    public int time;
    public int room;
    public Vector<Student> Students;
    public Map<Student, Mark> marks;
    public Map<Student, Attendance> attendance;
    public Group() {}
	public Group(Teacher teacher, int time, int room) {
		super();
		this.teacher = teacher;
		this.time = time;
		this.room = room;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public Vector<Student> getStudents() {
		return Students;
	}
	public void setStudents(Vector<Student> students) {
		Students = students;
	}
	public Map<Student, Mark> getMarks() {
		return marks;
	}
	public void setMarks(Map<Student, Mark> marks) {
		this.marks = marks;
	}
	public Map<Student, Attendance> getAttendance() {
		return attendance;
	}
	public void setAttendance(Map<Student, Attendance> attendance) {
		this.attendance = attendance;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + room;
		result = prime * result + time;
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
		Group other = (Group) obj;
		if (room != other.room)
			return false;
		if (time != other.time)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Group [teacher=" + teacher + ", time=" + time + ", room=" + room + "]";
	}
    
    
}
