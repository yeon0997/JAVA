package hw06;

public class Student {

	public static int serialnum = 1000; //�겢�옒�뒪蹂��닔, �뒪�깭�떛蹂��닔
	public int studentid;
	public String studentname;
	public int grade;
	public int money;
	public String address;
	
	
	//�씠?��꾧낵 媛�吏꾨룉�?�� 留ㅺ컻蹂��?��濡� 諛쏅?�� �깮�꽦�옄
	public Student(String studentname, int money) {	//studentname?�� money�뒗 吏��뿭蹂��닔
		this.studentid = ++serialnum;
		this.studentname = studentname;
		this.money = money;
	}
	
	public void takeonbus(Bus bus) {	//Bus�뒗 �겢�옒�뒪濡� 留뚮�? 李몄?�蹂��?��
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
	
	public void taketaxi(Taxi taxi) {
		Taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showinfo() {
		System.out.println(money);
	}
	
	
	
}
