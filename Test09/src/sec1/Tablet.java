package sec1;

public class Tablet implements Computer {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("태블릿 모니터의 기본 해상도: 640X960");
	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub
		System.out.println("터치로 타이핑합니다.");
	}

	@Override
	public void power(boolean sw) {
		// TODO Auto-generated method stub
		if(sw) System.out.println("태블릿의 전원을 킵니다.");
		else System.out.println("태블릿의 전원을 끔니다.");
	}
	
	//overloading 돤 변수
	public void power(String name, boolean sw) {
	
	}
}
