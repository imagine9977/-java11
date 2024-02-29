package exam01;

public class Amateur implements Gamer {
	final static int MAX_SPEED =50;
	final static int MAX_HEIGHT = 2;
	@Override
	public void run(int speed) {
		if(speed>MAX_SPEED){System.out.println("최대 속도는 "+MAX_SPEED+"를 초과하면 안된다");}
		else System.out.println("속도는 "+speed+"입니다");
		
	}
	@Override
	public void jump(int height) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void turn(int angle) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}
