package hw04;

import java.util.Scanner;

public class A04_switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a;
		int result = 0;
		
		System.out.println("?埆?瀽毳? ?瀰?牓?暣欤检劯?殧.");
		a = sc.nextInt();
		
		if(a % 3 == 0)
			result = 1;
			
		else if(a % 4 == 0)
			result = 2;
		
		else if(a % 5 == 0)
			result = 3;
		
		switch(result) {
		case 1:  
			System.out.println("3?潣 氚办垬");
			break;
		case 2:  
			System.out.println("4?潣 氚办垬");
			break;
		case 3:  
			System.out.println("5?潣 氚办垬");
			break;
		default :
			System.out.println("3, 4, 5 氚办垬 ?澊?櫢?潣 ?垬");
			break;
		}
		
	}

}
