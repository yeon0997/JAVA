package ch04;

public class A05_whilestmt {

	public static void main(String[] args) {

		/*
		 * 1~10까지 합계를 구하는 프로그램을 while문을 이용하여 작성
		 */
		
		int num = 1;
		int even = 0, odd = 0;
		/*
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		
		
		while(num <= 100) {
			
			if(num % 2 == 0) {
				even = even + num;
			}
			
			else if(num % 2 ==1) {
				odd = odd + num;
			}
			
			num++;
			
		}
		*/
		
		while(num <= 100) {
			
			if((num % 2) == 0)
				even = even + num;
			
			else
				odd = odd + num;
				
			num++;
			
		}//end of while
		
		System.out.println("짝수의 합은 " + even);
		System.out.println("홀수의 합은 " + odd);
		
	}

}
