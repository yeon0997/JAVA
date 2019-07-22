/*데이터 타입
-기본자료형
정수형 byte, short, int, long
문자형 char
실수형 float, double
논리형 boolean*/


package ch02;

public class A02_Character {

	public static void main(String[] args) {
		byte b_num1 = 127; //byte의 유효숫자범위 -2^7 ~ 2^7-1 -128~127
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		short s_num2 = 32767; //short의 유효숫자 범위는 -2^15 ~ 2^15-1 -32768 ~32767
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);

		
		int i_num3 = -2147483648; //int의 유효숫자 범위는 -2^31 ~ 2^31-1 -2147483648 ~ 2147483647
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		//long의 유효숫자범위 -2^63 ~ 2^63-1
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		short sval = 1;
		int ival =1;
		float fval = 1.0f;
		
		//서로 다른 데이터 타입의 데이터를 혼합 연산할 때 연산 결과는 범위가 큰 쪽으로 변환되어 처리된다
		System.out.println("short형과 int형의 혼합연산 " + (sval + ival)); //(sval + ival)에서 괄호를 쓰지 않으면 문자와 숫자가 더해져 변형된 값이 나온다
		System.out.println(ival + fval);
		
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		int ch2 = 66;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		char ch3 = '\u1100';
		System.out.println(ch3);
		System.out.println((int)ch3);
		
		

	}

}
