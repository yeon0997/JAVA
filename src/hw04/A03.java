package hw04;

import java.util.Scanner;

public class A03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		int d;
		
		System.out.println("a�? ?��?��?��주세?��.");
		a = sc.nextInt();
		
		System.out.println("b�? ?��?��?��주세?��.");
		b = sc.nextInt();
		
		System.out.println("c�? ?��?��?��주세?��.");
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












