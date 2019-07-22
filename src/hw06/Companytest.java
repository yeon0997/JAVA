package hw06;

public class Companytest {

	public static void main(String[] args) {

		//Company mycompany1 = new Company(); //?ƒ?„±?ë¥? ?†µ?•´?„œ ê°ì²´ë¥? ?ƒ?„±?•  ?ˆ˜ ?—†?‹¤
		
		Company mycompany1 = Company.getinstance();
		Company mycompany2 = Company.getinstance();
		
		System.out.println(mycompany1);
		System.out.println(mycompany2);
		
	}//main

}
