package ch06;

public class Subway {

	String linenumber;
	int passengercount;
	int money;
	
	public Subway(String linenumber) {	//생성자
		this.linenumber = linenumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengercount++;
	}
	
	public void showinfo() {
		System.out.println("지하철" + linenumber + " 지하철 승객은 " 
						+ passengercount + "명이고, 수입은 " + money + "입니다.");
	}
	
}
