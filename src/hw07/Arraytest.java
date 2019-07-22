//ë°°ì—´?„ ?–¸
//?ë£Œí˜•[] ë°°ì—´?´ë¦? = new ?ë£Œí˜•[ê°œìˆ˜]
//?ë£Œí˜• ë°°ì—´?´ë¦?[] = new ?ë£Œí˜•[ê°œìˆ˜]

package hw07;

public class Arraytest {
	
	public static void main(String[] args)	{
		
		//?•„?˜?‘ê°œëŠ” ê°™ì? ê²?
		//int[] studentids = new int[10];
		//int studentids[] = new int[10];
		
		int studentids[] = new int[] {100, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; //ê°’ì„ ì´ˆê¸°?™”?•œ ë°°ì—´
		
//		for(int i = 0, num = 10; i < 10; i++, num--)  {
//		studentids[i] = num;
//		}
		
		for(int i = 0; i < studentids.length; i++) //length?Š” ë°°ì—´?˜ ê°œìˆ˜ë¥? ??™?œ¼ë¡? ?„¼?‹¤
		System.out.printf("%3d",studentids[i]);

	}
	
}
