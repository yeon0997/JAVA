package ch08;

public class Sedan extends Car {
	//������ ȣ����� Ȯ��
	//����Ʈ������
	public Sedan() {
		System.out.println("Sedan Ŭ���� ������ ȣ��");
	}
	
	//������ �����ε� - ������
	//���۷� ���� ����Ŭ������ ȣ���ϸ� �Ķ���͸� ���� ���� �Ķ���͸� �����Ѵ�
	public Sedan(String name) {
		super("�����~~~~~`");
		System.out.println("Sedan Ŭ���� ������ ȣ��  with " + name);
	}
	
}
