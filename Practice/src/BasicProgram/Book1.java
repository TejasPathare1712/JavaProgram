package BasicProgram;

public class Book1 {
	String title;
	String author;
	float price;
	

	public Book1() {
		super();
		System.out.println("Default Constructor");
	}
	


	public Book1(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}



	public Book1(String title, String author, float price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	


	@Override
	public String toString() {
		return "Book1 [title=" + title + ", author=" + author + ", price=" + price + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book1 b1 = new Book1();
		System.out.println(b1);
		Book1 b2 = new Book1("Atomic habits","James clear");
		System.out.println(b2);
		Book1 b3 = new Book1("Think and grow rich","Naplonien Hill",500);
		System.out.println(b3);
		

	}

}
