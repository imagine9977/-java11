package sec1;

public class BookeExam {
	public static void main(String[] args) {
		Book[] book = new Book[100];
		book[0]= new Book("StackE","David Copper");
		book[1]= new Book("Intro to Java","Julian Clare");
		book[2]= new Book("Java for Dummies","Robin Jackson");
		book[3]= new Book("2023 tech giants","Frank Hoffenheim");
		book[4]= new Book("LOL","Dua Dia");
		for(int i=0;i<5;i++) {
			System.out.println( book[i].toString());
		}
		
	}
}
