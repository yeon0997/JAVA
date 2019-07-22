package ch04;

public class PR05_2 {

	public static void main(String[] args) {

		int i, j;
		
		for(i = 1; i <= 9; i++)
		{
			System.out.println();
			
			for(j = 1; j <= 9; j++)
			{
				if(i < j)
					break;
				
				System.out.println(i + " * " + j + " = " + (i * j));
				
			}//for
		}//for
		
	}

}
