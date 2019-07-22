package ch03;

import java.util.Scanner;

public class A07_conditionaloperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int result;
		 * 
		 * result = (10 < 5) ? 100 : 999;
		 * 
		 * System.out.println(result);
		 */
////////////////////////////////////////////////////////
		
		int mage, fage;
		String  result1;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("어머니의 나이를 입력하세요.");
		mage = sc.nextInt();
		System.out.println("아버지의 나이를 입력하세요.");
		fage = sc.nextInt();
		
		result1 = (mage > fage)? "어머니" : "아버지";
		
		
		System.out.println(result1 + "의 나이가 많으세요");
		
	}

}
