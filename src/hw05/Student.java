package hw05;

//?��?��?��?��?��
public class Student{
	int id;
	private String name;
	int grade;
	String dept;
	String address;
	
	//original constructor
	public Student() {
		System.out.println("기본?��?��?�� ?���?");
	}
	
	public Student(String p_name) {
		name = p_name;
		System.out.println("?��름을 �?�? ?��?��?�� ?���?");
	}
	
	//?? ?��?��미터 ?��?��?��
	public Student(int p_id,String p_name, int p_grade, String p_dept, String p_address) {
		id = p_id;
		name = p_name;
		grade = p_grade;
		dept = p_dept;
		address = p_address;
		
		System.out.println("full parameter ?��?��?�� ?���?");
		
	}
	
	public void setname(String pname) {
		name = pname;
	}
	
	public String getname()
	{
		return name;
	}
	
	public void study() {	//메소?��
		System.out.println(name + "?��(�?) " + dept +  "�? 공�??��?��.");
	}
	
	public void showInfo() {
		System.out.println(id + ", " + name + ", " + grade + ", " + dept + ", " + address);
	}
	
	
}// end of class Student
