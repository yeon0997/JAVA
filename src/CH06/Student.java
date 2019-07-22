package ch06;

public class Student {

	public static int serialnum = 1000; //클래스변수, 스태틱변수
	public int studentid;
	public String studentname;
	public int grade;
	public int money;
	public String address;
	
	
	//이름과 가진돈을 매개변수로 받는 생성자
	public Student(String studentname, int money) {	//studentname과 money는 지역변수
		this.studentid = ++serialnum;
		this.studentname = studentname;
		this.money = money;
	}
	
	public void takeonbus(Bus bus) {	//Bus는 클래스로 만든 참조변수
		bus.takeon(1000);
		this.money -= 1000;
	}
	
	public void takeoffbus(Bus bus) {
		bus.takeoff();
	}
	
	public void takesubway(Subway subway) {
		
		subway.take(1500);
		this.money -=1500;
	}
	
	public void showinfo() {
		System.out.println(studentid);
	}
	
	public static void showserial() {
		System.out.println(serialnum);
	}
	
	
}
