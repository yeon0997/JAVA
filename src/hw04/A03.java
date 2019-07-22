package ch04;

import java.util.Scanner;

public class A03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		int d;
		
		System.out.println("a를 입력해주세요.");
		a = sc.nextInt();
		
		System.out.println("b를 입력해주세요.");
		b = sc.nextInt();
		
		System.out.println("c를 입력해주세요.");
		c = sc.nextInt();
		
		d = a;
		


		
		if(b > d) {
			d = b;
	
		}
		
		if(c > d){
			d = c;
		}

		System.out.println(d);
		

	}

}












