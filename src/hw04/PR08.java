/*
 * 방정?�� 4X + 5Y =60?�� 모든 ?���? 구하?�� ?��로그?��?�� ?��?��?��?��?��. XY?�� 10?��?��?�� ?��?��?��
 */


package hw04;

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
