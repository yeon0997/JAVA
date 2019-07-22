package ch06;

public class Companytest {

	public static void main(String[] args) {

		//Company mycompany1 = new Company(); //생성자를 통해서 객체를 생성할 수 없다
		
		Company mycompany1 = Company.getinstance();
		Company mycompany2 = Company.getinstance();
		
		System.out.println(mycompany1);
		System.out.println(mycompany2);
		
	}//main

}
