package hw05;

//?´?˜?Š¤?„ ?–¸
public class Student{
	int id;
	private String name;
	int grade;
	String dept;
	String address;
	
	//original constructor
	public Student() {
		System.out.println("ê¸°ë³¸?ƒ?„±? ?˜¸ì¶?");
	}
	
	public Student(String p_name) {
		name = p_name;
		System.out.println("?´ë¦„ì„ ê°?ì§? ?ƒ?„±? ?˜¸ì¶?");
	}
	
	//?? ?Œ¨?Ÿ¬ë¯¸í„° ?ƒ?„±?
	public Student(int p_id,String p_name, int p_grade, String p_dept, String p_address) {
		id = p_id;
		name = p_name;
		grade = p_grade;
		dept = p_dept;
		address = p_address;
		
		System.out.println("full parameter ?ƒ?„±? ?˜¸ì¶?");
		
	}
	
	public void setname(String pname) {
		name = pname;
	}
	
	public String getname()
	{
		return name;
	}
	
	public void study() {	//ë©”ì†Œ?“œ
		System.out.println(name + "?´(ê°?) " + dept +  "ë¥? ê³µë??•œ?‹¤.");
	}
	
	public void showInfo() {
		System.out.println(id + ", " + name + ", " + grade + ", " + dept + ", " + address);
	}
	
	
}// end of class Student
