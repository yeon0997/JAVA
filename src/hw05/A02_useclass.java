/*
 * ?��?��?��?�� ?��?��?�� constructor\
 * ?��?��?��로�??�� 객체�? ?��?��?��?��
 * ?��?��?��?�� 기본?��?���? ?��?��?���? ?��?��?��?��
 * 
 */


package hw05;

public class A02_useclass {

	public static void main(String[] args) { 

		/*
		Student st1 = new Student(); //st1?? 첨조�??��
		Student st2 = new Student("?��길동");
		Student st3 = new Student(1, "박문?��", 4, "컴퓨?���?", "�??���?");
		
		st1.study();
		st2.study();
		st3.study();
		st3.showInfo();
		*/
		////////////////////////////////////////////////////////////////
		
		//Student st1 = new Student();
	//	st1.setname("?��?��?��"); //setname?��?��?�� 메소?���? ?��?�� private �??���? ?��?��
	//	st1.id = 1;
	//	st1.address = "�??���?";	
	//	//System.out.println(st1.getname());
	//	System.out.println(st1.id);
	//	System.out.println(st1.address);
		
		InfoHiding info = new InfoHiding();
		info.setId(1);
		System.out.println(info.getId());
		
		
	}

}








