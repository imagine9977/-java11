package package2;

public class Book {
	private int serialN;
	private String title;
	private int price;
	private String author;
	private String publisher;
	
	public void print() {
		System.out.println("제품정보");
	}
	public void print(int serialN) {
		System.out.println("제품번호: "+this.serialN);
	}
	public void print(String title) {
		System.out.println("제품제목: "+this.title);
	}
	public void print(int serialN,String title) {
		System.out.println("제품번호: "+this.serialN);
		System.out.println("제품제목: "+this.title);
	}
	public int getSerialN() {
		return serialN;
	}
	public void setSerialN(int serialN) {
		this.serialN = serialN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
}
