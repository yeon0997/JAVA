package ch08;

public class Customerovr {

	public static void main(String[] args) {
	
		Customer customerLee = new Customer(1001, "이순신");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(1002, "김유신", 12345);
		customerKim.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(customerLee.getCustomerName() + "님이 지불해야 하는 금액은 "
				+ customerLee.calcPrice(price) + "원입니다.");
		System.out.println(customerKim.getCustomerName() + "님이 지불해야 하는 금액은 "
				+ customerLee.calcPrice(price) + "원입니다.");
	}

}
