/*
 * 의사코드
 * 1. 변수를 선언한다
 * 2. beginnum와 endnum를 입력받는다
 * 3. num = beginnum로 셋한다
 * 4. num가 endnum보다 작거나 같으면 반복
 * 4-1. sum += num
 * 4-2. num++
 * 5. 합계를 출력한다
 */



package ch04;

import java.util.Scanner;

public class A05_whileexercise {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*
		int start, end, sum = 0, origin = 0;
				
		
		System.out.println("시작 수");
		start = sc.nextInt();
		origin = start;
		
		System.out.println("끝 수");
		end = sc.nextInt();
		
		while(end >= start) {
			sum = sum + start;
			
			start++;
		}
		*/
		
		int num, beginnum, endnum, sum = 0;
		
		System.out.println("시작수 ");
		beginnum = sc.nextInt();
		
		System.out.println("끝 수");
		endnum = sc.nextInt();
		
		num = beginnum;
		
		while(num <= endnum) {
			
			//sum += num;
			
			if((num % 3) == 0 || (num % 5) ==0)
				System.out.println(num);
			
			num++;
		}
		
		//System.out.println(beginnum + "부터 " + endnum + "까지의 합은 " + sum);
		
	}

}
