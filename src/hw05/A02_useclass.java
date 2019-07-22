/*
 * ?´?˜?Š¤?˜ ?ƒ?„±? constructor\
 * ?´?˜?Š¤ë¡œë??„° ê°ì²´ë¥? ?ƒ?„±?•œ?‹¤
 * ?´?˜?Š¤?Š” ê¸°ë³¸? ?œ¼ë¡? ?ƒ?‚°?ë¥? ?¬?•¨?•œ?‹¤
 * 
 */


package hw05;

public class A02_useclass {

	public static void main(String[] args) { 

		/*
		Student st1 = new Student(); //st1?? ì²¨ì¡°ë³??ˆ˜
		Student st2 = new Student("?™ê¸¸ë™");
		Student st3 = new Student(1, "ë°•ë¬¸?ˆ˜", 4, "ì»´í“¨?„°ê³?", "ì²??›êµ?");
		
		st1.study();
		st2.study();
		st3.study();
		st3.showInfo();
		*/
		////////////////////////////////////////////////////////////////
		
		//Student st1 = new Student();
	//	st1.setname("?‹ ? •?—°"); //setname?´?¼?Š” ë©”ì†Œ?“œë¥? ?†µ?•´ private ë³??ˆ˜ë¥? ?‚¬?š©
	//	st1.id = 1;
	//	st1.address = "ì²??›êµ?";	
	//	//System.out.println(st1.getname());
	//	System.out.println(st1.id);
	//	System.out.println(st1.address);
		
		InfoHiding info = new InfoHiding();
		info.setId(1);
		System.out.println(info.getId());
		
		
	}

}








