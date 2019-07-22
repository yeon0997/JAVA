package hw04;

import java.util.Scanner;

public class CH04_1_IF {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		String op;
		
		System.out.println("숫자 a");
		a = sc.nextInt();
		System.out.println("숫자 b");
		b = sc.nextInt();
		System.out.println("연산자");
		op = sc.next();
		
		if(op == "+") {
			c = a + b;
			System.out.println(c);
		}
		if(op == "-") {
			System.out.println(a - b);
		}
		if(op == "*") {
			System.out.println(a * b);
		}
		if(op == "/") {
			System.out.println(a / b);
		}
		
	}

}
