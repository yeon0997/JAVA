package ch08;

public class Sedan extends Car {
	//생성자 호출관계 확인
	//디폴트생성자
	public Sedan() {
		System.out.println("Sedan 클래스 생성자 호출");
	}
	
	//생성자 오버로딩 - 다형성
	//슈퍼로 인해 상위클래스를 호출하면 파라미터를 슈퍼 안의 파라미터를 대입한다
	public Sedan(String name) {
		super("여기요~~~~~`");
		System.out.println("Sedan 클래스 생성자 호출  with " + name);
	}
	
}
