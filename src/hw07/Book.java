package hw07;

public class Book {

	private String bookname;
	private String author;
	
	public Book() {}	//기본?��?��?��
	
	public Book(String bookname, String author) {	//책이름과 ???���? 받는 ?��?��?��
		this.bookname = bookname;
		this.author = author;
	}

	/**
	 * @return the bookname
	 */
	public String getBookname() {
		return bookname;
	}

	/**
	 * @param bookname the bookname to set
	 */
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showbookinfo() {
		System.out.println(bookname + ", " + author);
	}
	
}
