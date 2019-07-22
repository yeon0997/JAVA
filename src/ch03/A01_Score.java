package ch03;

import java.util.Scanner;

public class A01_Score {

	public static void main(String[] args) { //메인시작
		
		String  name; //string으로 이름을 받는다
		int  kor, eng, math; //국어, 영어, 수학, 총점을 int형으로 받는다
		double  avg, sum; //평균을 double로 받는다
		
		Scanner sc = new Scanner(System.in); //스캐너 클래스를 작성
		
		System.out.println("이름을 입력하세요."); //이름을 입력하세요 문장 출력
		name = sc.next(); //이름을 받는 scanner
		
		System.out.println("국어점수를 입력하세요.");
		kor = sc.nextInt(); //국어점수를 입력받음
		System.out.println("영어점수를 입력하세요.");
		eng = sc.nextInt(); //영어점수를 입력받음
		System.out.println("수학점수를 입력하세요.");
		math = sc.nextInt(); //수학점수를 입력받음
		
		sum = kor + eng + math; //국어, 영어, 수학 점수를 합한다
		avg = sum / 3.0; //총점을 3으로 나누어 평균을 구한다
		System.out.println("총 점수는 " + sum + "점 입니다."); //총점 출력
		System.out.println("평균점수는 " + avg + "입니다"); //평점 출력
		
	} //메인종료

}
