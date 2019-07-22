package ch04;

import java.util.Scanner;

public class PR06 {

	public static void main(String[] args) {

		//1. 변수를 선언
		int a = 0, b = 0, num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//2. 작업을 반복하다가 4번이면 종료
		while(num != 4)
		{
			
			System.out.println("작업번호를 입력해주세요. 1. 입금 2. 출금 3. 조회 4.종료");
			num = sc.nextInt();

			switch(num)
			{
			case 1 :	//입금
				System.out.println("입금할 금액을 입력하세요");
				b = sc.nextInt();
				a = a + b;
				System.out.println("잔고는 " + a + "입니다" );
				b = 0;
				break;
			
			case 2 :	//출금
				System.out.println("출금할 금액을 입력하세요");
				b = sc.nextInt();
			
				if(a >= b)
				{
					a = a - b;
					System.out.println("잔고는 " + a + "원 입니다" );
				}
			
				else
				{
					System.out.println("잔고가 부족합니다");
				}
				break;
		
			case 3 :	//예금조회
				System.out.println("잔고는 " + a + "원 입니다");
				break;
		
			case 4 :	//종료
				System.out.println("작업을 종료합니다");
				break;
				
			case 5 : //오류
				System.out.println("오류!");
				break;
		
			} //case
		
		
		}//while
			
	}

}
