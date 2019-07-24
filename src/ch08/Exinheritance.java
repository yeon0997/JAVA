package ch08;

public class Exinheritance {

	public static void main(String[] args) {
		//먼저 상속관계에 있는 클래스들의 생성자 호출 관계를 확인
		//car클래스가 먼저 생성되고 sedan이 생성됨
		Sedan sedan1 = new Sedan(); //sedan1이라는 객체 생성
		
		//sub클래스가 슈퍼클래스를 호출할때 별도의 명시가 없는 한 default생성자를 호출한다.
		Sedan sedan2 = new Sedan("jungse");
		
	}

}
