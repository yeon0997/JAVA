package ch08;

public class Customerovr {

	public static void main(String[] args) {
	
		Customer customerLee = new Customer(1001, "�̼���");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(1002, "������", 12345);
		customerKim.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(customerLee.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ��� "
				+ customerLee.calcPrice(price) + "���Դϴ�.");
		System.out.println(customerKim.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ��� "
				+ customerLee.calcPrice(price) + "���Դϴ�.");
	}

}
