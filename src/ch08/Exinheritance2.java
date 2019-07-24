package ch08;

public class Exinheritance2 {

	public static void main(String[] args) {

		Sedan2 mysedan = new Sedan2();
		Truck2 mytruck = new Truck2();
		
		mysedan.color = "ÆÄ¶û";
		mysedan.speed = 0;
		mysedan.takeOn();
		mysedan.showInfo();
		
		System.out.println("====================");
		
		mytruck.color = "»¡°­";
		mytruck.speed = 0;
		mytruck.takeOn();mytruck.takeOn();mytruck.takeOn();
		mytruck.showInfo();
		
	}

}
