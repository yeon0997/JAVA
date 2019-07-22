package ch07;

public class Bookarray {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] nlibrary = new Book[10];
		
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가", "유시만");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생텍쥐페리");
		
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		} //library[i]를 syso하면 주소가 나옴
		
		System.out.println();
		
		for (int i = 0; i < library.length; i++) {
			library[i].showbookinfo(); //내용을 조회하려면 메소드를 사용해야한다
		}
		
		System.arraycopy(library, 0, nlibrary, 0, 5);	//배열복사
		System.out.println();
		
		for (int i = 0; i < nlibrary.length; i++) {
			if(nlibrary[i] != null)
			nlibrary[i].showbookinfo(); //내용을 조회하려면 메소드를 사용해야한다
		}
		
	}

}
