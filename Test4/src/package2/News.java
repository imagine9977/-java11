package package2;

public class News {
	private int bno;
	private String title;
	private String username;
	private String content;
	private String date;
	private int visited;
	
	public News(int bno, String title, String username, String content, String date) {
		this(bno, title, username, content,date, 0);
	}
	public News(int bno, String title, String username, String content, String date, int visited) {
		this.bno = bno;
		this.title = title;
		this.username = username;
		this.content = content;
		this.date = date;
		this.visited = visited;
	}
}
