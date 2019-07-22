package ch02;

import java.util.Scanner;

public class Ex01_recArea {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a, b;

		System.out.println("사각형의 가로를 입력하세요.(cm)");
		a = sc.nextInt();
		
		System.out.println("사각형의 세로를 입력하세요.(cm)");
		b = sc.nextInt();
		
		System.out.println("사각형의 넓이는 " + (a * b)+ "cm^2" + "입니다.");
	}

}