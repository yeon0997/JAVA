	/*
	 * 07-4 배열 응용 프로그램
	 * p226 예제 시나리오, ArrayList를 사용해 학생 성적 출력 프로그램을 구성
	 * 학생 객체를 구현하기 위한 학생 클래스 구현
	 */

package ch07;
import java.util.ArrayList;
//import javax.security.auth.Subject;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(int studentid, String studentname) {
		this.studentID = studentid;
		this.studentName = studentname;
		subjectList = new ArrayList<Subject>();
	}//end of constructor student
	
	public void addSubject(String name, int Score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(Score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList) {
			total +=s.getScorePoint();
			System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목성적은 " + s.getScorePoint() + "입니다.");
		}
		System.out.println("학생 " + studentName + " 의 총점은 " + total + " 입니다.");
	}
	
	
	}//end of class
	

