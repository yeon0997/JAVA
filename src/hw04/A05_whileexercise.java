/*
 * ??¬μ½λ
 * 1. λ³??λ₯? ? ?Έ??€
 * 2. beginnum?? endnumλ₯? ?? ₯λ°λ?€
 * 3. num = beginnumλ‘? ???€
 * 4. numκ°? endnumλ³΄λ€ ?κ±°λ κ°μΌλ©? λ°λ³΅
 * 4-1. sum += num
 * 4-2. num++
 * 5. ?©κ³λ?? μΆλ ₯??€
 */



package hw04;

import java.util.Scanner;

public class A05_whileexercise {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*
		int start, end, sum = 0, origin = 0;
				
		
		System.out.println("?? ?");
		start = sc.nextInt();
		origin = start;
		
		System.out.println("? ?");
		end = sc.nextInt();
		
		while(end >= start) {
			sum = sum + start;
			
			start++;
		}
		*/
		
		int num, beginnum, endnum, sum = 0;
		
		System.out.println("??? ");
		beginnum = sc.nextInt();
		
		System.out.println("? ?");
		endnum = sc.nextInt();
		
		num = beginnum;
		
		while(num <= endnum) {
			
			//sum += num;
			
			if((num % 3) == 0 || (num % 5) ==0)
				System.out.println(num);
			
			num++;
		}
		
		//System.out.println(beginnum + "λΆ??° " + endnum + "κΉμ?? ?©?? " + sum);
		
	}

}
