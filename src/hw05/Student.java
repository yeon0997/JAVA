package ch05;

//클래스선언
public class Student{
	int id;
	private String name;
	int grade;
	String dept;
	String address;
	
	//original constructor
	public Student() {
		System.out.println("기본생성자 호출");
	}
	
	public Student(String p_name) {
		name = p_name;
		System.out.println("이름을 가진 생성자 호출");
	}
	
	//풀 패러미터 생성자
	public Student(int p_id,String p_name, int p_grade, String p_dept, String p_address) {
		id = p_id;
		name = p_name;
		grade = p_grade;
		dept = p_dept;
		address = p_address;
		
		System.out.println("full parameter 생성자 호출");
		
	}
	
	public void setname(String pname) {
		name = pname;
	}
	
	public String getname()
	{
		return name;
	}
	
	public void study() {	//메소드
		System.out.println(name + "이(가) " + dept +  "를 공부한다.");
	}
	
	public void showInfo() {
		System.out.println(id + ", " + name + ", " + grade + ", " + dept + ", " + address);
	}
	
	
}// end of class Student
