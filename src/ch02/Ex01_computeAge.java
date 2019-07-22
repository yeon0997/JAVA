package ch02;

import java.util.Scanner;

public class Ex01_computeAge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		int birth;
		
		System.out.println("이름을 입력하세요.");
		name = sc.next();
		
		System.out.println("생년을 입력하세요.");
		birth = sc.nextInt();
		
		int age = 2019 - birth;
		
		System.out.println(name + "님의 나이는 " + age + "입니다.");

	}

}