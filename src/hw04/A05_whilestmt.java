package hw04;

public class A05_whilestmt {

	public static void main(String[] args) {

		/*
		 * 1~10κΉμ? ?©κ³λ?? κ΅¬ν? ?λ‘κ·Έ?¨? whileλ¬Έμ ?΄?©??¬ ??±
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
		
		System.out.println("μ§μ? ?©?? " + even);
		System.out.println("???? ?©?? " + odd);
		
	}

}
