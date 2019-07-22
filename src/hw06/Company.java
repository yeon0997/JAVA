package ch06;

public class Company {

	//private생성자
	private static Company instance = new Company(); //더이상 컴파니라는 인스턴스는 만들 수 없음
	
	private Company() {} 
	
	public static Company getinstance() {
		if(instance == null) {	//기존에 만들어진 인스턴스가 없다면
			instance = new Company(); //인스턴스를 만들고
		}
		return instance; //있다면 원래있던 인스턴스를 반환하라
	}
	
	
	
}
