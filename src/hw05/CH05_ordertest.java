package hw05;


public class CH05_ordertest {

	public static void main(String[] args) {
		CH05_Order order = new CH05_Order();
		
		order.orderId = 201803120001L;
		order.customerId = "abc123";
		order.orderDate = "2018년 3월 12일"; 
		order.customerName = "홍길순";
		order.productId = "PD345-12";
		order.shippingAddress = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호: " + order.orderId);
		System.out.println("주문자 아이디: " + order.customerId);
		System.out.println("주문 날짜: " + order.orderDate);
		System.out.println("주문자 이름: " + order.customerName);
		System.out.println("주문 상품 번호: " + order.productId);
		System.out.println("배송 주소: " + order.shippingAddress);
	}

}
