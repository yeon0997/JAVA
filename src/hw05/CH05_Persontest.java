package CH05;

public class CH05_Persontest {

	public static void main(String[] args) {
		CH05_Person person = new CH05_Person();
		person.age = 40;
		person.name = "James";
		person.isMarried = true;
		person.numberOfChildren = 3;
		
		System.out.println("���� :" + person.age);
		System.out.println("�̸� :" + person.name);
		System.out.println("��ȥ ���� :" + person.isMarried);
		System.out.println("�ڳ� �� :" + person.numberOfChildren);
		
		CH05_Person shin = new CH05_Person("������", 162, 45);
		
		
	}
}
