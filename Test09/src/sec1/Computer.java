package sec1;

public interface Computer {//interface: 모든 메소드는 주장 메소드이다
	//구현 클래스에서 반드시 인터페이스에서 정의한 대로 매개변수와 반환타입대로 구현을 해야 한다
	void display();
	void typing();
	void power(boolean sw);
	
}
