package course;
import enums.*;
import java.util.*;

public class Mark {
	private double firstAtt;
	private double secondAtt;
	private double finalexam;
	public Mark() {}
	public Mark(double firstAtt, double secondAtt, double finalexam) {
		super();
		this.firstAtt = firstAtt;
		this.secondAtt = secondAtt;
		this.finalexam = finalexam;
	}
	//code
	public double getMark() {
		return this.firstAtt+this.secondAtt+this.finalexam;
	}
	public String getGrade() {
		String grade="";
		double mark = this.getMark();
		if (mark>94)grade="A"; else
		if (mark>89)grade="A-"; else
		if (mark>84)grade="B+"; else
		if (mark>79)grade="B"; else
		if (mark>74)grade="B-"; else
		if (mark>69)grade="C+"; else
		if (mark>64)grade="C"; else
		if (mark>59)grade="C-"; else
		if (mark>54)grade="D+"; else
		if (mark>49)grade="D"; else
		if (mark>24)grade="FX"; else
		grade="F";
		return grade;
	}
	public double getGPA() {
		String grade = this.getGrade();
		double gpa = 0;
		if (grade.equals("A")) gpa = 4.0; else
		if (grade.equals("A-")) gpa = 3.67; else 
		if (grade.equals("B+")) gpa = 3.33; else
		if (grade.equals("B")) gpa = 3.0; else 
		if (grade.equals("B-")) gpa = 2.67; else
		if (grade.equals("C+")) gpa = 2.33; else 
		if (grade.equals("C")) gpa = 2.0; else
		if (grade.equals("C-")) gpa = 1.67; else 
		if (grade.equals("D+")) gpa = 1.33; else
		if (grade.equals("D")) gpa = 1.0; else 
		if (grade.equals("FX")) gpa = 0.5; else
		if (grade.equals("F")) gpa = 0;
		return gpa;
	}
	//end
	public double getFirstAtt() {
		return firstAtt;
	}
	public void setFirstAtt(double firstAtt) {
		this.firstAtt = firstAtt;
	}
	public double getSecondAtt() {
		return secondAtt;
	}
	public void setSecondAtt(double secondAtt) {
		this.secondAtt = secondAtt;
	}
	public double getFinalexam() {
		return finalexam;
	}
	public void setFinalexam(double finalexam) {
		this.finalexam = finalexam;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(finalexam);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(firstAtt);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(secondAtt);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Mark other = (Mark) obj;
		if (Double.doubleToLongBits(finalexam) != Double.doubleToLongBits(other.finalexam))
			return false;
		if (Double.doubleToLongBits(firstAtt) != Double.doubleToLongBits(other.firstAtt))
			return false;
		if (Double.doubleToLongBits(secondAtt) != Double.doubleToLongBits(other.secondAtt))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Mark [firstAtt=" + firstAtt + ", secondAtt=" + secondAtt + ", finalexam=" + finalexam + "]";
	}
	
}