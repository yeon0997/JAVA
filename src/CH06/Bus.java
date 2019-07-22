package ch06;

public class Bus {

	int busnumber;
	int passengercount;
	int money;
	
	public Bus(int busnumber) {	//생성자
		this.busnumber = busnumber;
	}
	
	public void takeon(int money) {
		this.money += money;
		passengercount++;
	}
	
	public void takeoff() {
		this.passengercount--;
	}
	
	public void showinfo() {
		System.out.println("버스" + busnumber + "번의 승객은" 
						+ passengercount + "명이고, 수입은 " + money + "입니다.");
	}
	
}
