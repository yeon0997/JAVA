package ch07;

public class SmallAlphabet {

	public static void main(String[] args) {

		char[][] arr = new char[13][2];
		int k = 97;
		
		for(int i = 0; i < 13; i++) {
			for(int j = 0; j < 2; j++) {

				arr[i][j] = (char)k;
				k++;
			}
			
		}
		
		for(int i = 0; i < 13; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.printf("%2c", arr[i][j]);
			}
			System.out.println();
		}
	}

}
