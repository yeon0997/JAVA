package hw04;

import java.util.Scanner;

public class A02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("?ˆ«?ë¥? ?…? ¥?•˜?„¸?š”.");
		num = sc.nextInt();
		
		if((num % 2) == 0)
		{
			System.out.println(num + "??(?Š”) ì§ìˆ˜?…?‹ˆ?‹¤.");
		}
		
		else
		{
			System.out.println(num + "??(?Š”) ???ˆ˜?…?‹ˆ?‹¤.");
		}
		
	} //ë©”ì¸ì¢…ë£Œ

}
