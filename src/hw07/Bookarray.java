package hw07;

public class Bookarray {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] nlibrary = new Book[10];
		
		library[0] = new Book("?��백산�?", "조정?��");
		library[1] = new Book("?��미안", "?��르만 ?��?��");
		library[2] = new Book("?��?���? ?�� 것인�?", "?��?���?");
		library[3] = new Book("?���?", "박경�?");
		library[4] = new Book("?��린왕?��", "?��?��쥐페�?");
		
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		} //library[i]�? syso?���? 주소�? ?��?��
		
		System.out.println();
		
		for (int i = 0; i < library.length; i++) {
			library[i].showbookinfo(); //?��?��?�� 조회?��?���? 메소?���? ?��?��?��?��?��?��
		}
		
		System.arraycopy(library, 0, nlibrary, 0, 5);	//배열복사
		System.out.println();
		
		for (int i = 0; i < nlibrary.length; i++) {
			if(nlibrary[i] != null)
			nlibrary[i].showbookinfo(); //?��?��?�� 조회?��?���? 메소?���? ?��?��?��?��?��?��
		}
		
	}

}
