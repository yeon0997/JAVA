package hw07;

public class Student {

	int studentid;
	String name;
	
	public void Student(int studentid, String name) {
		this.studentid = studentid;
		this.name = name;
	}
	
	public void showStudentInfo() {
		System.out.println(studentid + ", " +  name);
	}
}
