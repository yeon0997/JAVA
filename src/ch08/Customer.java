package ch08;

public class Customer {

	int customerID;
	String customerName;
	String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
		System.out.println("Customer 생성자 호출!!");
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public void showInfo() {
		System.out.println(customerName + " 님의 등급은 " + customerGrade + " 이며 보너스 포인트는 " + bonusPoint + "입니다.");
	}
	
}
