package ch08;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		int price = 10000;
		
		//������ ����ȯ
		Customer customerlee = new Customer(100, "�̼���");
		Customer customershin = new Customer(20, "�Ż��Ӵ�");
		Customer customerhong = new GoldCustomer(300, "ȫ�浿");
		Customer customeryoul = new GoldCustomer(400, "������");
		Customer customerkim = new VIPCustomer(500, "������", 12345);
		
		//arraylist�� add �޼ҵ带 �̿��� customerlist�� �����͸� ����
		customerList.add(customerlee);
		customerList.add(customershin);
		customerList.add(customerhong);
		customerList.add(customeryoul);
		customerList.add(customerkim);
		
		
		System.out.println("������");
		
		for(Customer customer : customerList) {
			customer.showInfo();
		}
		
		System.out.println("�������� ����Ʈ ���");
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() +	" ���� " + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName() + " ���� ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint + "���Դϴ�.");
		}
		
	}

}