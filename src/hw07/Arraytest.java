//배열?��?��
//?��료형[] 배열?���? = new ?��료형[개수]
//?��료형 배열?���?[] = new ?��료형[개수]

package hw07;

public class Arraytest {
	
	public static void main(String[] args)	{
		
		//?��?��?��개는 같�? �?
		//int[] studentids = new int[10];
		//int studentids[] = new int[10];
		
		int studentids[] = new int[] {100, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; //값을 초기?��?�� 배열
		
//		for(int i = 0, num = 10; i < 10; i++, num--)  {
//		studentids[i] = num;
//		}
		
		for(int i = 0; i < studentids.length; i++) //length?�� 배열?�� 개수�? ?��?��?���? ?��?��
		System.out.printf("%3d",studentids[i]);

	}
	
}
