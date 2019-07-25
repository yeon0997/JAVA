package ch08;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		int price = 10000;
		
		//묵시적 형변환
		Customer customerlee = new Customer(100, "이순신");
		Customer customershin = new Customer(20, "신사임당");
		Customer customerhong = new GoldCustomer(300, "홍길동");
		Customer customeryoul = new GoldCustomer(400, "이율곡");
		Customer customerkim = new VIPCustomer(500, "김유신", 12345);
		
		//arraylist의 add 메소드를 이용해 customerlist에 데이터를 대입
		customerList.add(customerlee);
		customerList.add(customershin);
		customerList.add(customerhong);
		customerList.add(customeryoul);
		customerList.add(customerkim);
		
		
		System.out.println("고객정보");
		
		for(Customer customer : customerList) {
			customer.showInfo();
		}
		
		System.out.println("할인율과 포인트 계산");
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() +	" 님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + " 님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
		}
		
	}

}