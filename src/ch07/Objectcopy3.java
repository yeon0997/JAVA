package ch07;

public class Objectcopy3 {

	public static void main(String[] args) {
		
		Book[] bookarray1 = new Book[3];
		Book[] bookarray2 = new Book[3];
		
		bookarray1[0] = new Book("�¹���", "������");
		bookarray1[1] = new Book("���̾�", "�츣�� �켼");
		bookarray1[2] = new Book("��� �� ���ΰ�", "���ù�");
		
		bookarray2[0] = new Book();
		bookarray2[1] = new Book();
		bookarray2[2] = new Book();
		
		for(int i = 0; i < bookarray1.length; i++) {
			bookarray2[i].setBookname(bookarray1[i].getBookname());
			bookarray2[i].setAuthor(bookarray1[i].getAuthor());
		}
		
		
		//�迭����
//		System.arraycopy(bookarray1, 0, bookarray2, 0, 3);
		
		//����� �纻 Ȯ��
		for(int i = 0; i<bookarray2.length; i++)
			bookarray2[i].showbookinfo();
		
		//���� ����
		bookarray1[0].setBookname("����");
		bookarray1[0].setAuthor("�ڿϼ�");
		
		//���� Ȯ��
		System.out.println("-���� �迭");
		bookarray1[0].showbookinfo();
		
		//�纻 Ȯ��
		System.out.println("-�纻 �迭");
		bookarray2[0].showbookinfo();
		
	}

}
