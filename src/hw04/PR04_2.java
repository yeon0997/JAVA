package ch04;


import java.util.Scanner;

public class PR04_2 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		int a, b;
		String operator;
		
		System.out.println("숫자 a");
		a = sc.nextInt();
		System.out.println("숫자 b");
		b = sc.nextInt();
		System.out.println("연산자");
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
