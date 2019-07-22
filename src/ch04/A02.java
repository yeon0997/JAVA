package ch04;

import java.util.Scanner;

public class A02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("숫자를 입력하세요.");
		num = sc.nextInt();
		
		if((num % 2) == 0)
		{
			System.out.println(num + "은(는) 짝수입니다.");
		}
		
		else
		{
			System.out.println(num + "은(는) 홀수입니다.");
		}
		
	} //메인종료

}
