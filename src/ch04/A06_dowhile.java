/*
 * do{
 * 	반복실행할 문장
 * }while(조건식);
 * 
 * while과 다른점
 * while은 조건식을 먼저 판별하고
 * do while은 괄호 안의 문장을 실행 후 while을 판별한다
 */

package ch04;

public class A06_dowhile {

	public static void main(String[] args) {

		int num = 1;
		
		do {
			System.out.println(num);
			num++;
		}while(num <= 5);
		
	}

}
