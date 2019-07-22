package hw04;

public class A08_forstmt {

	public static void main(String[] args) {

		
		int i = 1, j = 1;
		
		//ì¤‘ì²©?œ while
//		while(i <= 9) {
//			
//			System.out.println(i);
//			j = 1;
//			
//			while(j <= 9) {
//				System.out.println(i + "*" + j + "=" + i * j );
//				
//				j++;
//			}//while
//				
//			i++;
//			System.out.println();
//		}//while
//		
		for(i = 1; i <= 9; i++) {
			for(j = 1; j <= 9; j++)
			{
				System.out.println(i + "*" + j + "=" + i * j );
			}//inner for loop
			
		System.out.println();
		}//outer for loop
	}

}
