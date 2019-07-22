package hw05;

public class Car {
	// member �??��, field, ?��?��
	private String color;
	private String engine;
	private String inner;
	private int speed = 0;
	
	
	//car()?�� car(string pcolor)?? ?��?��?�� �? ?��?��?�� overload
	//overload ?��?��?�� ?��름을 �?�?�? ?��?��개의 메소?���? 만드?���? ?��?��미터?�� �??��?? ???��?���? 구분
	//overriding ?��?��?�� 개념?�� ?��?��?��?��
	
	public Car() {
		this("�??��", "?��?��","?��브릭");
	}
	
	public Car(String color, String engine, String inner) {
		//�??���? 받는 ?��?��?��
		this.color = color;
		this.engine = engine;
		this.inner = inner;
	}
	
	Car returnitself()
	{
		return this; //?�� ?��?��?���? �??�� ?��?��?�� 객체?�� ?��?�� 주소값을 리턴?��?��.
	}
	
	
///////////////////////////////////////////////////////////////////////////////////////
	public void setspeed(int value) { //private?���? ?�� �??��?�� 값을 �?경하�? ?��?�� 메소?��
		speed = value;
	}
	
	// member 메소?��, 메소?��, ?��?��
	//�??�� 메소?��
	public void upspeed(int value){ //?���? 곳에?��?�� ?��?��?�� ?�� ?���?, 반환값이 ?��?�� 메소?��
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
		System.out.println("컬러 : " + color +", " + "?��?��?��?��?�� " + speed);
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
