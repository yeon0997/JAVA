package hw05;

public class Car {
	// member λ³??, field, ??±
	private String color;
	private String engine;
	private String inner;
	private int speed = 0;
	
	
	//car()? car(string pcolor)?? ?€??± μ€? ??±? overload
	//overload ??Ό? ?΄λ¦μ κ°?μ§?κ³? ?¬?¬κ°μ λ©μ?λ₯? λ§λ?κ²? ??Όλ―Έν°? κ°???? ????Όλ‘? κ΅¬λΆ
	//overriding ??? κ°λ?΄ ??΄?Ό?¨
	
	public Car() {
		this("κ²?? ", "?? €","?¨λΈλ¦­");
	}
	
	public Car(String color, String engine, String inner) {
		//λ³??λ₯? λ°λ ??±?
		this.color = color;
		this.engine = engine;
		this.inner = inner;
	}
	
	Car returnitself()
	{
		return this; //?΄ ?΄??€λ‘? λΆ??° ??±? κ°μ²΄? ?? μ£Όμκ°μ λ¦¬ν΄??€.
	}
	
	
///////////////////////////////////////////////////////////////////////////////////////
	public void setspeed(int value) { //private?Όλ‘? ? λ³??? κ°μ λ³?κ²½νκΈ? ?? λ©μ?
		speed = value;
	}
	
	// member λ©μ?, λ©μ?, ?¨?
	//κ°?? λ©μ?
	public void upspeed(int value){ //?€λ₯? κ³³μ?? ?¬?©?  ? ?κ³?, λ°νκ°μ΄ ?? λ©μ?
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
		System.out.println("μ»¬λ¬ : " + color +", " + "??¬??? " + speed);
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
