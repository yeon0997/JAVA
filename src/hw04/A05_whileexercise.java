/*
 * ?˜?‚¬ì½”ë“œ
 * 1. ë³??ˆ˜ë¥? ?„ ?–¸?•œ?‹¤
 * 2. beginnum?? endnumë¥? ?…? ¥ë°›ëŠ”?‹¤
 * 3. num = beginnumë¡? ?…‹?•œ?‹¤
 * 4. numê°? endnumë³´ë‹¤ ?‘ê±°ë‚˜ ê°™ìœ¼ë©? ë°˜ë³µ
 * 4-1. sum += num
 * 4-2. num++
 * 5. ?•©ê³„ë?? ì¶œë ¥?•œ?‹¤
 */



package hw04;

import java.util.Scanner;

public class A05_whileexercise {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*
		int start, end, sum = 0, origin = 0;
				
		
		System.out.println("?‹œ?‘ ?ˆ˜");
		start = sc.nextInt();
		origin = start;
		
		System.out.println("? ?ˆ˜");
		end = sc.nextInt();
		
		while(end >= start) {
			sum = sum + start;
			
			start++;
		}
		*/
		
		int num, beginnum, endnum, sum = 0;
		
		System.out.println("?‹œ?‘?ˆ˜ ");
		beginnum = sc.nextInt();
		
		System.out.println("? ?ˆ˜");
		endnum = sc.nextInt();
		
		num = beginnum;
		
		while(num <= endnum) {
			
			//sum += num;
			
			if((num % 3) == 0 || (num % 5) ==0)
				System.out.println(num);
			
			num++;
		}
		
		//System.out.println(beginnum + "ë¶??„° " + endnum + "ê¹Œì??˜ ?•©?? " + sum);
		
	}

}
