package package2;
//using class board
public class OverloadEX3 {
	public static void main(String[] args) {
		Board b1= new Board();
		b1.setBno(1);
		b1.setTitle("123");
		b1.setAuthor("Bob");
		Board b2= new Board(101);
		b2.setTitle("EMG");
		b2.setAuthor("Ross");
		Board b3 = new Board(102, "Lets go!!!!!");
		b3.setAuthor("Sinclair");
		Notice n1 = new Notice(101,"kdsd","살려줘","2014-02-19","ㅇㅇㅇ","잭슨",5);
		System.out.println(n1.toString());
	}
}
