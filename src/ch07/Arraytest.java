//배열선언
//자료형[] 배열이름 = new 자료형[개수]
//자료형 배열이름[] = new 자료형[개수]

package ch07;

public class Arraytest {
	
	public static void main(String[] args)	{
		
		//아래두개는 같은 것
		//int[] studentids = new int[10];
		//int studentids[] = new int[10];
		
		int studentids[] = new int[] {100, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; //값을 초기화한 배열
		
//		for(int i = 0, num = 10; i < 10; i++, num--)  {
//		studentids[i] = num;
//		}
		
		for(int i = 0; i < studentids.length; i++) //length는 배열의 개수를 자동으로 센다
		System.out.printf("%3d",studentids[i]);

	}
	
}
