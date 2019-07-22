package hw07;

public class Bookarray {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] nlibrary = new Book[10];
		
		library[0] = new Book("?ƒœë°±ì‚°ë§?", "ì¡°ì •?˜");
		library[1] = new Book("?°ë¯¸ì•ˆ", "?—¤ë¥´ë§Œ ?—¤?„¸");
		library[2] = new Book("?–´?–»ê²? ?‚´ ê²ƒì¸ê°?", "?œ ?‹œë§?");
		library[3] = new Book("?† ì§?", "ë°•ê²½ë¦?");
		library[4] = new Book("?–´ë¦°ì™•?", "?ƒ?…ì¥í˜ë¦?");
		
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		} //library[i]ë¥? syso?•˜ë©? ì£¼ì†Œê°? ?‚˜?˜´
		
		System.out.println();
		
		for (int i = 0; i < library.length; i++) {
			library[i].showbookinfo(); //?‚´?š©?„ ì¡°íšŒ?•˜? ¤ë©? ë©”ì†Œ?“œë¥? ?‚¬?š©?•´?•¼?•œ?‹¤
		}
		
		System.arraycopy(library, 0, nlibrary, 0, 5);	//ë°°ì—´ë³µì‚¬
		System.out.println();
		
		for (int i = 0; i < nlibrary.length; i++) {
			if(nlibrary[i] != null)
			nlibrary[i].showbookinfo(); //?‚´?š©?„ ì¡°íšŒ?•˜? ¤ë©? ë©”ì†Œ?“œë¥? ?‚¬?š©?•´?•¼?•œ?‹¤
		}
		
	}

}
