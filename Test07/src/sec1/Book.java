package sec1;

public class Book {
	private String name;
	private String author;
	public Book() {
		
	}
	public Book(String name, String author) {
		this.name= name;
		this.author= author;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + "]";
	}
	
}
