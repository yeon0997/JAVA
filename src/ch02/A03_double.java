/*
실수형 데이터 타입
float 4byte(부호비트 1, 지수부 8, 가수부 23bit)
double 8byte(부호비트 1, 지수부 11, 가수부 52bit)
*/

package ch02;

public class A03_double {

	public static void main(String[] args) {
	
	//자바에서 기본 실수형은 double형으로 인식
	//실수를 float형으로 취급하려면 숫자 뒤에 f를 붙여야 함
	double dnum = 3.14;
	float fnum = 3.14f;
	
	System.out.println(dnum);
	System.out.println(fnum);
	
	//실수를 부동소수점으로 표현하면 생기는 문제
	double dval = 1;
	
	for (int i = 0; i < 10000; i++)
	{
			
			dval = dval + 0.1;
			
	}
	System.out.println(dval);
	
	}

}
