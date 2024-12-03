package BasicProgram;

public class Book {
	String title;
	String author;
	double price;
	int stock;
	


	public Book(String title, String author, double price, int stock) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock = stock;
	}
	public void displayBookDetails() {
		System.out.println("Title = "+title);
		System.out.println("Author = "+author);
		System.out.println("Price = "+price);
		System.out.println("Stock = "+stock);
		
	}
	public void discount() {
		if(stock>100) {
			price = price-50;
			System.out.println("Price after discount is = "+ price);
			
		}
		else {
			System.out.println("There is no discount");
		}
		
	}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("atomic habit","james clear",500.0,200);
		Book b2 = new Book("Think and Grow rich","Napolean hill",1000,50);
		b1.displayBookDetails();
		b1.discount();
		System.out.println("---------------------------------------");
		b2.displayBookDetails();
		b2.discount();
		
		
	}

}
