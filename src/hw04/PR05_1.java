package hw04;

public class PR05_1 {

	public static void main(String[] args) {

		int i, j;
		
		for(i = 1; i <= 9; i++)
		{
			
			if(i % 2 == 1)
				continue;
			System.out.println(i + "?‹¨");
			
			for(j = 1; j <= 9; j++)
				System.out.println(i + " * " + j + " = " + (i * j));
				System.out.println();
		}
		
	}

}
