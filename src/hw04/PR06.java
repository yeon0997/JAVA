package hw04;

import java.util.Scanner;

public class PR06 {

	public static void main(String[] args) {

		//1. �??���? ?��?��
		int a = 0, b = 0, num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//2. ?��?��?�� 반복?��?���? 4번이�? 종료
		while(num != 4)
		{
			
			System.out.println("?��?��번호�? ?��?��?��주세?��. 1. ?���? 2. 출금 3. 조회 4.종료");
			num = sc.nextInt();

			switch(num)
			{
			case 1 :	//?���?
				System.out.println("?��금할 금액?�� ?��?��?��?��?��");
				b = sc.nextInt();
				a = a + b;
				System.out.println("?��고는 " + a + "?��?��?��" );
				b = 0;
				break;
			
			case 2 :	//출금
				System.out.println("출금?�� 금액?�� ?��?��?��?��?��");
				b = sc.nextInt();
			
				if(a >= b)
				{
					a = a - b;
					System.out.println("?��고는 " + a + "?�� ?��?��?��" );
				}
			
				else
				{
					System.out.println("?��고�? �?족합?��?��");
				}
				break;
		
			case 3 :	//?��금조?��
				System.out.println("?��고는 " + a + "?�� ?��?��?��");
				break;
		
			case 4 :	//종료
				System.out.println("?��?��?�� 종료?��?��?��");
				break;
				
			case 5 : //?���?
				System.out.println("?���?!");
				break;
		
			} //case
		
		
		}//while
			
	}

}
