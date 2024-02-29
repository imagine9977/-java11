package sec2;

public class DatabaseExam1 {
	public static void main(String[] args) {
		Database db;
		db = new Oracle();
		db.connect(Oracle.URL, Oracle.PORT+"", Oracle.ID, Oracle.PW);
		db.select("board", " where title like\'%\'+알림\'%='"); //알림이 나오는 글들 검색
		db.insert("board", "\'제목10\'", 10);
		
		db = new Mysql();
		db.connect(Mysql.URL, Mysql.PORT+"", Mysql.ID, Mysql.PW);
		db.select("board", " where title like\'%\'+알림\'%='"); //알림이 나오는 글들 검색
		db.insert("board", "\'제목10\'", 10);
		
		db = new MariaDB();
		db.connect(MariaDB.URL, MariaDB.PORT+"", MariaDB.ID, MariaDB.PW);
		db.select("board", " where title like\'%\'+알림\'%='"); //알림이 나오는 글들 검색
		db.insert("board", "\'제목10\'", 10);
	}
}
