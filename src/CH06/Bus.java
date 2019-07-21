package CH06;

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
		System.out.println("踰꾩뒪" + busnumber + "踰덉쓽 �듅媛앹�" 
						+ passengercount + "紐낆씠怨�, �닔�엯�� " + money + "�엯�땲�떎.");
	}
	
}
