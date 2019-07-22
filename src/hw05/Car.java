package hw05;

public class Car {
	// member ë³??ˆ˜, field, ?†?„±
	private String color;
	private String engine;
	private String inner;
	private int speed = 0;
	
	
	//car()?ž‘ car(string pcolor)?? ?‹¤?˜•?„± ì¤? ?ƒ?„±?ž overload
	//overload ?™?¼?•œ ?´ë¦„ì„ ê°?ì§?ê³? ?—¬?Ÿ¬ê°œì˜ ë©”ì†Œ?“œë¥? ë§Œë“œ?Š”ê²? ?ŒŒ?¼ë¯¸í„°?˜ ê°??ˆ˜?? ???ž…?œ¼ë¡? êµ¬ë¶„
	//overriding ?ƒ?†?˜ ê°œë…?´ ?žˆ?–´?•¼?•¨
	
	public Car() {
		this("ê²?? •", "?””? ¤","?Œ¨ë¸Œë¦­");
	}
	
	public Car(String color, String engine, String inner) {
		//ë³??ˆ˜ë¥? ë°›ëŠ” ?ƒ?„±?ž
		this.color = color;
		this.engine = engine;
		this.inner = inner;
	}
	
	Car returnitself()
	{
		return this; //?´ ?´?ž˜?Š¤ë¡? ë¶??„° ?ƒ?„±?œ ê°ì²´?˜ ?‹œ?ž‘ ì£¼ì†Œê°’ì„ ë¦¬í„´?•œ?‹¤.
	}
	
	
///////////////////////////////////////////////////////////////////////////////////////
	public void setspeed(int value) { //private?œ¼ë¡? ?œ ë³??ˆ˜?˜ ê°’ì„ ë³?ê²½í•˜ê¸? ?œ„?•œ ë©”ì†Œ?“œ
		speed = value;
	}
	
	// member ë©”ì†Œ?“œ, ë©”ì†Œ?“œ, ?•¨?ˆ˜
	//ê°??† ë©”ì†Œ?“œ
	public void upspeed(int value){ //?‹¤ë¥? ê³³ì—?„œ?„ ?‚¬?š©?•  ?ˆ˜ ?žˆê³?, ë°˜í™˜ê°’ì´ ?—†?Š” ë©”ì†Œ?“œ
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
		System.out.println("ì»¬ëŸ¬ : " + color +", " + "?˜„?ž¬?†?„?Š” " + speed);
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
