	/*
	 * 07-4 �迭 ���� ���α׷�
	 * p226 ���� �ó�����, ArrayList�� ����� �л� ���� ��� ���α׷��� ����
	 * �л� ��ü�� �����ϱ� ���� �л� Ŭ���� ����
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
			System.out.println("�л� " + studentName + "�� " + s.getName() + " �������� " + s.getScorePoint() + "�Դϴ�.");
		}
		System.out.println("�л� " + studentName + " �� ������ " + total + " �Դϴ�.");
	}
	
	
	}//end of class
	

