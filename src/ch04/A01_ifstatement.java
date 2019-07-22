package ch04;


public class A01_ifstatement {

	public static void main(String[] args) {

		int age = 10, money;
		
		/*if(age <= 10)
		{
			System.out.println(age + "세 " + "입장료 1000원입니다.");
		}
		
		else if(age <= 20)
		{
			System.out.println(age + "세 " + "입장료 2000원입니다.");
		}
		
		else
		{	
			System.out.println(age + "세 " + "입장료 3000원입니다.");	
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
		
		System.out.println(age + "세 " + "입장료 " + money +"원입니다.");
		
	} //메인종료

}
