package hw05;


public class CH05_ordertest {

	public static void main(String[] args) {
		CH05_Order order = new CH05_Order();
		
		order.orderId = 201803120001L;
		order.customerId = "abc123";
		order.orderDate = "2018�� 3�� 12��"; 
		order.customerName = "ȫ���";
		order.productId = "PD345-12";
		order.shippingAddress = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ: " + order.orderId);
		System.out.println("�ֹ��� ���̵�: " + order.customerId);
		System.out.println("�ֹ� ��¥: " + order.orderDate);
		System.out.println("�ֹ��� �̸�: " + order.customerName);
		System.out.println("�ֹ� ��ǰ ��ȣ: " + order.productId);
		System.out.println("��� �ּ�: " + order.shippingAddress);
	}

}
