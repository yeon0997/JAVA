package ch09;

public abstract class Computer {

	public abstract void display();  // body ���� �޼���
	public abstract void typing();   // body ���� �޼���
	public void turnOn() {  // body �ִ� �޼���
		System.out.println("������ �մϴ�.");
	}
	public void turnOff() {  // body �ִ� �޼���
		System.out.println("������ ���ϴ�.");
	
	}
	
}