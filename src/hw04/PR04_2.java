package hw04;


import java.util.Scanner;

public class PR04_2 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		int a, b;
		String operator;
		
		System.out.println("?��?�� a");
		a = sc.nextInt();
		System.out.println("?��?�� b");
		b = sc.nextInt();
		System.out.println("?��?��?��");
		operator = sc.next();
		
		switch(operator) {
		case "+" :
			System.out.println(a + b);
			break;
		case "-" :
			System.out.println(a - b);
			break;
		case "*" :
			System.out.println(a * b);
			break;
		case "/" :
			System.out.println(a / b);
			break;
		default :
			System.out.println("�߸��� ����");
			break;
		}//case
		

	}

}
