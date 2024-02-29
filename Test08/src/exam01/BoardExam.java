package exam01;

import java.util.ArrayList;
import java.util.List;

public class BoardExam {
	
	
	public static void main(String[] args) {
		List<Board> boardList = new ArrayList<Board>();
		for(int i=1;i<=6;i++) {
			Board board = new Board(i,"r"+i,"s"+i,"t"+i,"c"+i,i);
			boardList.add(board);
		}
		System.out.println("a\t s \t b \t c \t d\ts" );
		for(Board board:boardList) {
			System.out.println(board.getBno()+"\t"+board.getTitle()); //알아서 채우면 된다.
			
		}
	}
	
}

