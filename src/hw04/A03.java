package hw04;

import java.util.Scanner;

public class A03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		int d;
		
		System.out.println("aë¥? ?ž…? ¥?•´ì£¼ì„¸?š”.");
		a = sc.nextInt();
		
		System.out.println("bë¥? ?ž…? ¥?•´ì£¼ì„¸?š”.");
		b = sc.nextInt();
		
		System.out.println("cë¥? ?ž…? ¥?•´ì£¼ì„¸?š”.");
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












