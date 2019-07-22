package hw04;


import java.util.Scanner;

public class PR04_2 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		int a, b;
		String operator;
		
		System.out.println("?ˆ«? a");
		a = sc.nextInt();
		System.out.println("?ˆ«? b");
		b = sc.nextInt();
		System.out.println("?—°?‚°?");
		operator = sc.next();
		
		switch(operator) {
		case "+" :
			System.out.println(a + b);
			break;
		case "-" :
			System.out.println(a - b);
			break;
		case "*" :
			System.out.println(a * b);
			break;
		case "/" :
			System.out.println(a / b);
			break;
		default :
			System.out.println("ï¿½ß¸ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½");
			break;
		}//case
		

	}

}
