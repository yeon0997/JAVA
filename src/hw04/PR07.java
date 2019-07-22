package hw04;

import java.util.Scanner;

public class PR07 {

	public static void main(String[] args) {

		int i, j;
		
		Scanner sc = new Scanner(System.in);
		
		do {

		System.out.println("?ˆ«?ë¥? ?…? ¥?•´ì£¼ì„¸?š”");
		i = sc.nextInt();
			
		if(i == 0)
				break;
			
		for(j = 1; j <= 9; j++)
			System.out.println(i + " * " + j + " = " + (i * j));
			
		} while(i != 0); //while
		 
		 System.out.println("ì¢…ë£Œ");
		
	}

}
