package hw06;

public class Subway {

	String linenumber;
	int passengercount;
	int money;
	
	public Subway(String linenumber) {	//�깮�꽦�옄
		this.linenumber = linenumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengercount++;
	}
	
	public void showinfo() {
		System.out.println("吏��븯泥�" + linenumber + " 吏��븯泥� �듅媛앹�? " 
						+ passengercount + "紐낆?��?��, �닔�엯�� " + money + "�엯�땲�떎.");
	}
	
}
