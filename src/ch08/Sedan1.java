package ch08;

public class Sedan1 extends Car1{
	//field
	//color, speed는 Car1에서 상속된 것
	//private이라면 접근할 수 없다 따라서 set, get이 필요함
	
	public void setSpeed(int speed) {
		//	this.speed = speed;
		}
		
		public void setColor(String color) {
			super.setColor(color);
		}
		
		public String getColor() {
			return super.getColor();
		}
	
	
}
