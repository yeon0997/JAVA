package hw04;


public class A01_ifstatement {

	public static void main(String[] args) {

		int age = 10, money;
		
		/*if(age <= 10)
		{
			System.out.println(age + "?„¸ " + "?ž…?ž¥ë£? 1000?›?ž…?‹ˆ?‹¤.");
		}
		
		else if(age <= 20)
		{
			System.out.println(age + "?„¸ " + "?ž…?ž¥ë£? 2000?›?ž…?‹ˆ?‹¤.");
		}
		
		else
		{	
			System.out.println(age + "?„¸ " + "?ž…?ž¥ë£? 3000?›?ž…?‹ˆ?‹¤.");	
		}
		*/
		
		if(age <= 10)
		{
			money = 1000;
		}
		
		else if(age <= 20)
		{
			money = 2000;;
		}
		
		else
		{	
			money = 3000;;	
		}
		
		System.out.println(age + "?„¸ " + "?ž…?ž¥ë£? " + money +"?›?ž…?‹ˆ?‹¤.");
		
	} //ë©”ì¸ì¢…ë£Œ

}
