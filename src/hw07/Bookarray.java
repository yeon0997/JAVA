package hw07;

public class Bookarray {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] nlibrary = new Book[10];
		
		library[0] = new Book("?λ°±μ°λ§?", "μ‘°μ ?");
		library[1] = new Book("?°λ―Έμ", "?€λ₯΄λ§ ?€?Έ");
		library[2] = new Book("?΄?»κ²? ?΄ κ²μΈκ°?", "? ?λ§?");
		library[3] = new Book("? μ§?", "λ°κ²½λ¦?");
		library[4] = new Book("?΄λ¦°μ?", "??μ₯νλ¦?");
		
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		} //library[i]λ₯? syso?λ©? μ£Όμκ°? ??΄
		
		System.out.println();
		
		for (int i = 0; i < library.length; i++) {
			library[i].showbookinfo(); //?΄?©? μ‘°ν?? €λ©? λ©μ?λ₯? ?¬?©?΄?Ό??€
		}
		
		System.arraycopy(library, 0, nlibrary, 0, 5);	//λ°°μ΄λ³΅μ¬
		System.out.println();
		
		for (int i = 0; i < nlibrary.length; i++) {
			if(nlibrary[i] != null)
			nlibrary[i].showbookinfo(); //?΄?©? μ‘°ν?? €λ©? λ©μ?λ₯? ?¬?©?΄?Ό??€
		}
		
	}

}
