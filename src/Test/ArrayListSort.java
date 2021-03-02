package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSort {
public static void main(String[] args) {
	
	ArrayList<Student> arraylist = new ArrayList<Student>();
    arraylist.add(new Student(222, "Messi", 29));
    arraylist.add(new Student(333, "Ronaldo", 31));
    arraylist.add(new Student(111, "john", 23));

    
    System.out.println(arraylist);
    Collections.sort(arraylist, Student.SNameCom);
    System.out.println(arraylist);	
}
}
class Student implements Comparator<Student>{

	private String studentname;
    private int rollno;
    private int studentage;

    public Student(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }
    public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }
	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}

	/*
	 * @Override public int compareTo(Student arg) { int age = ((Student)
	 * arg).getStudentage();
	 * 
	 * 
	 * // TODO Auto-generated method stub return this.studentage - age; }
	 */
	
	public static Comparator<Student> SNameCom = new Comparator<Student>() {
		@Override
		public int compare(Student s1, Student s2) {
			
			String st1 = s1.getStudentname().toUpperCase();
			String st2 = s2.getStudentname().toUpperCase();
			
			// TODO Auto-generated method stub
			return st1.compareTo(st2);
		}	
	};

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
	

	
	
}
