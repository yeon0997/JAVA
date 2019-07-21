package CH05;

public class CH05_Persontest {

	public static void main(String[] args) {
		CH05_Person person = new CH05_Person();
		person.age = 40;
		person.name = "James";
		person.isMarried = true;
		person.numberOfChildren = 3;
		
		System.out.println("나이 :" + person.age);
		System.out.println("이름 :" + person.name);
		System.out.println("결혼 여부 :" + person.isMarried);
		System.out.println("자녀 수 :" + person.numberOfChildren);
		
		CH05_Person shin = new CH05_Person("신정연", 162, 45);
		
		
	}
}
