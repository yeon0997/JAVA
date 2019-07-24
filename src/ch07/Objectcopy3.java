package ch07;

public class Objectcopy3 {

	public static void main(String[] args) {
		
		Book[] bookarray1 = new Book[3];
		Book[] bookarray2 = new Book[3];
		
		bookarray1[0] = new Book("태백산맥", "조정래");
		bookarray1[1] = new Book("데미안", "헤르만 헤세");
		bookarray1[2] = new Book("어떻게 살 것인가", "유시민");
		
		bookarray2[0] = new Book();
		bookarray2[1] = new Book();
		bookarray2[2] = new Book();
		
		for(int i = 0; i < bookarray1.length; i++) {
			bookarray2[i].setBookname(bookarray1[i].getBookname());
			bookarray2[i].setAuthor(bookarray1[i].getAuthor());
		}
		
		
		//배열복사
//		System.arraycopy(bookarray1, 0, bookarray2, 0, 3);
		
		//복사된 사본 확인
		for(int i = 0; i<bookarray2.length; i++)
			bookarray2[i].showbookinfo();
		
		//원본 변경
		bookarray1[0].setBookname("나목");
		bookarray1[0].setAuthor("박완서");
		
		//원본 확인
		System.out.println("-원본 배열");
		bookarray1[0].showbookinfo();
		
		//사본 확인
		System.out.println("-사본 배열");
		bookarray2[0].showbookinfo();
		
	}

}
