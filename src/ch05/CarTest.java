/*
 * 스택메모리에 중세카가 생성됨
 * 
 */


package ch05;

public class CarTest {

	public static void main(String[] args) {

		Car jungseCar = new Car(); //생성자 constructor
		System.out.println(jungseCar);
		
		Car c = jungseCar.returnitself();
		System.out.println(c);
		
	}

}
