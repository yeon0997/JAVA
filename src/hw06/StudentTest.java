package hw06;

public class StudentTest {

	public static void main(String[] args) {
		//static�??�� ?��?��법알�?
		//static�??��?�� 객체?? 객체�? 공동?���? ?��?��?�� ?�� ?��?��
//		Student studentkim = new Student("kim", 10000);
//		studentkim.showinfo();
//		Student studentlee = new Student("lee", 10000);
//		studentlee.showinfo();
		
		//객체�? ?��?��?���? ?���? ?��?��?�� �??��값을 ?��?��?���?
		//static?�� 기능
		//System.out.println(Student.serialnum);
		//System.out.println(Student.grade); //static?�� ?��?��?��?�� 조회 불�?
		Student.showserial(); //serial?? static�??��?��?�� 객체�? ?��?��?���??��?��?�� 조회�? �??��?��?��
	}

}
