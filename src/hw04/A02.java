package hw04;

import java.util.Scanner;

public class A02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("?��?���? ?��?��?��?��?��.");
		num = sc.nextInt();
		
		if((num % 2) == 0)
		{
			System.out.println(num + "??(?��) 짝수?��?��?��.");
		}
		
		else
		{
			System.out.println(num + "??(?��) ???��?��?��?��.");
		}
		
	} //메인종료

}
