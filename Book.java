package ex11_01;

public class Book extends TangibleAsset {
	String isbn;
	int num;
	public Book(String name, int price, String color, String isbn) {
		super(name, price, color);
		this.isbn = isbn;
		
	}
	System.out.println(num);
	public String getIsbn() { return this.isbn; }
}

