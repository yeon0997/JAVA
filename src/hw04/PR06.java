package hw04;

import java.util.Scanner;

public class PR06 {

	public static void main(String[] args) {

		//1. ë³??ˆ˜ë¥? ?„ ?–¸
		int a = 0, b = 0, num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//2. ?‘?—…?„ ë°˜ë³µ?•˜?‹¤ê°? 4ë²ˆì´ë©? ì¢…ë£Œ
		while(num != 4)
		{
			
			System.out.println("?‘?—…ë²ˆí˜¸ë¥? ?…? ¥?•´ì£¼ì„¸?š”. 1. ?…ê¸? 2. ì¶œê¸ˆ 3. ì¡°íšŒ 4.ì¢…ë£Œ");
			num = sc.nextInt();

			switch(num)
			{
			case 1 :	//?…ê¸?
				System.out.println("?…ê¸ˆí•  ê¸ˆì•¡?„ ?…? ¥?•˜?„¸?š”");
				b = sc.nextInt();
				a = a + b;
				System.out.println("?”ê³ ëŠ” " + a + "?…?‹ˆ?‹¤" );
				b = 0;
				break;
			
			case 2 :	//ì¶œê¸ˆ
				System.out.println("ì¶œê¸ˆ?•  ê¸ˆì•¡?„ ?…? ¥?•˜?„¸?š”");
				b = sc.nextInt();
			
				if(a >= b)
				{
					a = a - b;
					System.out.println("?”ê³ ëŠ” " + a + "?› ?…?‹ˆ?‹¤" );
				}
			
				else
				{
					System.out.println("?”ê³ ê? ë¶?ì¡±í•©?‹ˆ?‹¤");
				}
				break;
		
			case 3 :	//?˜ˆê¸ˆì¡°?šŒ
				System.out.println("?”ê³ ëŠ” " + a + "?› ?…?‹ˆ?‹¤");
				break;
		
			case 4 :	//ì¢…ë£Œ
				System.out.println("?‘?—…?„ ì¢…ë£Œ?•©?‹ˆ?‹¤");
				break;
				
			case 5 : //?˜¤ë¥?
				System.out.println("?˜¤ë¥?!");
				break;
		
			} //case
		
		
		}//while
			
	}

}
