package package2;

public class Notice {
	private int bno;
	private String title;
	private String username;
	private String date;
	private String content;
	private String author;
	private int visited;
	
	public Notice(int bno,String title, String username,
			String date,String content,String author, int visited) 
	{this.bno=bno; this.title=title; this.username=username;
	this.date=date;this.content=content;this.author =author;this.visited=visited;}

	@Override
	public String toString() {
		return "Notice [bno=" + bno + ", title=" + title + ", username=" + username + ", date=" + date + ", content="
				+ content + ", author=" + author + ", visited=" + visited + "]";
	}
	
	
}
