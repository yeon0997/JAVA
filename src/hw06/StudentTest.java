package hw06;

public class StudentTest {

	public static void main(String[] args) {
		//staticë³??ˆ˜ ?‚¬?š©ë²•ì•Œê¸?
		//staticë³??ˆ˜?Š” ê°ì²´?? ê°ì²´ê°? ê³µë™?œ¼ë¡? ?‚¬?š©?•  ?ˆ˜ ?ˆ?‹¤
//		Student studentkim = new Student("kim", 10000);
//		studentkim.showinfo();
//		Student studentlee = new Student("lee", 10000);
//		studentlee.showinfo();
		
		//ê°ì²´ë¥? ?ƒ?„±?•˜ì§? ?•Šê³? ?´?˜?Š¤ ë³??ˆ˜ê°’ì„ ?™•?¸?•˜ê¸?
		//static?˜ ê¸°ëŠ¥
		//System.out.println(Student.serialnum);
		//System.out.println(Student.grade); //static?´ ?•„?‹ˆ?–´?„œ ì¡°íšŒ ë¶ˆê?
		Student.showserial(); //serial?? staticë³??ˆ˜?¼?„œ ê°ì²´ë¥? ?ƒ?„±?•˜ì§??•Š?•„?„ ì¡°íšŒê°? ê°??Š¥?•˜?‹¤
	}

}
