/*
 * 클래스의 생성자 constructor\
 * 클래스로부터 객체를 생성한다
 * 클래스는 기본적으로 생산자를 포함한다
 * 
 */


package ch05;

public class A02_useclass {

	public static void main(String[] args) { 

		/*
		Student st1 = new Student(); //st1은 첨조변수
		Student st2 = new Student("홍길동");
		Student st3 = new Student(1, "박문수", 4, "컴퓨터과", "청원구");
		
		st1.study();
		st2.study();
		st3.study();
		st3.showInfo();
		*/
		////////////////////////////////////////////////////////////////
		
		//Student st1 = new Student();
	//	st1.setname("신정연"); //setname이라는 메소드를 통해 private 변수를 사용
	//	st1.id = 1;
	//	st1.address = "청원구";	
	//	//System.out.println(st1.getname());
	//	System.out.println(st1.id);
	//	System.out.println(st1.address);
		
		InfoHiding info = new InfoHiding();
		info.setId(1);
		System.out.println(info.getId());
		
		
	}

}








