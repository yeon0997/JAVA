package ch03;

import java.util.Scanner;

public class A03_relationaloperateor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean b; //성년여부 boolean
		int birth, age; //생년, 나이 int
		
		//생년입력
		System.out.println("생년을 입력하세요.");
		birth = sc.nextInt();
		
		age = 2019 - birth;
		b = age >= 19; //나이가 19세 이상이면 성년
		
		System.out.println("나이 : " + age + " 성년여부 : " + b);
		
	}

}
