package ch05;

public class Car {
	// member 변수, field, 속성
	private String color;
	private String engine;
	private String inner;
	private int speed = 0;
	
	
	//car()랑 car(string pcolor)은 다형성 중 생성자 overload
	//overload 동일한 이름을 가지고 여러개의 메소드를 만드는것 파라미터의 갯수와 타입으로 구분
	//overriding 상속의 개념이 있어야함
	
	public Car() {
		this("검정", "디젤","패브릭");
	}
	
	public Car(String color, String engine, String inner) {
		//변수를 받는 생성자
		this.color = color;
		this.engine = engine;
		this.inner = inner;
	}
	
	Car returnitself()
	{
		return this; //이 클래스로 부터 생성된 객체의 시작 주소값을 리턴한다.
	}
	
	
///////////////////////////////////////////////////////////////////////////////////////
	public void setspeed(int value) { //private으로 된 변수의 값을 변경하기 위한 메소드
		speed = value;
	}
	
	// member 메소드, 메소드, 함수
	//가속 메소드
	public void upspeed(int value){ //다른 곳에서도 사용할 수 있고, 반환값이 없는 메소드
		if(speed + value >= 300)
			speed = 300;		
		else
		speed = speed + value;
	}
	
	public void downspeed(int value) {
		if(speed - value <= 0)
			speed = 0;		
		else
		speed = speed - value;	
	}
	
	public void showinfo() {
		System.out.println("컬러 : " + color +", " + "현재속도는 " + speed);
	}
////////////////////////////////////////////////////////////////
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the engine
	 */
	public String getEngine() {
		return engine;
	}

	/**
	 * @param engine the engine to set
	 */
	public void setEngine(String engine) {
		this.engine = engine;
	}

	/**
	 * @return the inner
	 */
	public String getInner() {
		return inner;
	}

	/**
	 * @param inner the inner to set
	 */
	public void setInner(String inner) {
		this.inner = inner;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
} //end of class
