package hw04;


public class A01_ifstatement {

	public static void main(String[] args) {

		int age = 10, money;
		
		/*if(age <= 10)
		{
			System.out.println(age + "?�� " + "?��?���? 1000?��?��?��?��.");
		}
		
		else if(age <= 20)
		{
			System.out.println(age + "?�� " + "?��?���? 2000?��?��?��?��.");
		}
		
		else
		{	
			System.out.println(age + "?�� " + "?��?���? 3000?��?��?��?��.");	
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
		
		System.out.println(age + "?�� " + "?��?���? " + money +"?��?��?��?��.");
		
	} //메인종료

}
