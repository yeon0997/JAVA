/*
 * 방정식 4X + 5Y =60의 모든 해를 구하는 프로그램을 작성하시오. XY는 10이하의 자연수
 */


package ch04;

public class PR08 {

	public static void main(String[] args) {

		int x, y;
		
		for(x = 1; x <= 10; x++)
		{
			for(y = 1; y <= 10; y++)
				if((4 * x + 5 * y) == 60)	
					System.out.println(x + ", " + y);
		}
		
		
	}

}
