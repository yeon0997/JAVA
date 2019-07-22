package hw04;

public class CH04_2 {

	public static void main(String[] args) {

		int i, j;
		
		for(i = 1; i <= 9; i++)
		{
			System.out.println(i + "´Ü");
			System.out.println();
			if(i % 2 == 0)
				continue;
			for(j = 1; j <= 9; j++)
				System.out.println(i + " * " + j + " = " + (i * j));
		}
		
	}

}
