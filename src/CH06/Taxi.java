package CH06;

public class Taxi {
	   int companyName;             // ȸ�� �̸�
	   int money;                 // �ý��� ����
		    
		 public Taxi(int companyName)   // ȸ�� �̸��� �Ű������� �޴� ������
		 {   
			  this.companyName = companyName;
		 }
		
		 public void take(int money)   // �°��� �� ���� ����
		 {  
			  this.money += money;    // �ý��� ���� ����
			  
		 }
		    
		 public void showInfo() {      // �ý� ������ ����ϴ� �Լ�
			  System.out.println(companyName + " �ý� ������ " + money + "�Դϴ�.");
		 }


}
