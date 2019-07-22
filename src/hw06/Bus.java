package hw06;

public class Bus {

	int busnumber;
	int passengercount;
	int money;
	
	public Bus(int busnumber) {	//�깮�꽦�옄
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
		System.out.println("踰꾩?��" + busnumber + "踰덉?�� �듅媛앹�?" 
						+ passengercount + "紐낆?��?��, �닔�엯�� " + money + "�엯�땲�떎.");
	}
	
}
