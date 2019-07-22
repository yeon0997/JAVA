package ch06;

public class StudentTest {

	public static void main(String[] args) {
		//static변수 사용법알기
		//static변수는 객체와 객체가 공동으로 사용할 수 있다
//		Student studentkim = new Student("kim", 10000);
//		studentkim.showinfo();
//		Student studentlee = new Student("lee", 10000);
//		studentlee.showinfo();
		
		//객체를 생성하지 않고 클래스 변수값을 확인하기
		//static의 기능
		//System.out.println(Student.serialnum);
		//System.out.println(Student.grade); //static이 아니어서 조회 불가
		Student.showserial(); //serial은 static변수라서 객체를 생성하지않아도 조회가 가능하다
	}

}
