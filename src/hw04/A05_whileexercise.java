/*
 * ?��?��코드
 * 1. �??���? ?��?��?��?��
 * 2. beginnum?? endnum�? ?��?��받는?��
 * 3. num = beginnum�? ?��?��?��
 * 4. num�? endnum보다 ?��거나 같으�? 반복
 * 4-1. sum += num
 * 4-2. num++
 * 5. ?��계�?? 출력?��?��
 */



package hw04;

import java.util.Scanner;

public class A05_whileexercise {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*
		int start, end, sum = 0, origin = 0;
				
		
		System.out.println("?��?�� ?��");
		start = sc.nextInt();
		origin = start;
		
		System.out.println("?�� ?��");
		end = sc.nextInt();
		
		while(end >= start) {
			sum = sum + start;
			
			start++;
		}
		*/
		
		int num, beginnum, endnum, sum = 0;
		
		System.out.println("?��?��?�� ");
		beginnum = sc.nextInt();
		
		System.out.println("?�� ?��");
		endnum = sc.nextInt();
		
		num = beginnum;
		
		while(num <= endnum) {
			
			//sum += num;
			
			if((num % 3) == 0 || (num % 5) ==0)
				System.out.println(num);
			
			num++;
		}
		
		//System.out.println(beginnum + "�??�� " + endnum + "까�??�� ?��?? " + sum);
		
	}

}
