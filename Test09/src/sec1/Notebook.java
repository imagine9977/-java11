package sec1;

public class Notebook implements Computer {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("노트북 모니터의 기본 해상도: 1920X1080");
	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub
		System.out.println("노트북은 일체형 키보드를 타이핑합니다.");
	}

	@Override
	public void power(boolean sw) {
		// TODO Auto-generated method stub
		if(sw) System.out.println("노트북탑의 전원을 킵니다.");
		else System.out.println("노트북의 전원을 끔니다.");
	}
	
	//overloading 돤 변수
	public void power(String name, boolean sw) {
		
	}
}
