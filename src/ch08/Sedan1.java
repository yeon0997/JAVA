package ch08;

public class Sedan1 extends Car1{
	//field
	//color, speed�� Car1���� ��ӵ� ��
	//private�̶�� ������ �� ���� ���� set, get�� �ʿ���
	
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
