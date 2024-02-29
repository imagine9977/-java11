package sec3;
//scope 특정 변수가 영향을 미치는 범위
public class ScopeExam {
	int a = 10; //전역 변수-> 클래스 전체에서 인지되는 변수이지만, 특정 메소드(함수)에서 인지 못됨
	static int b =100; // class variable 클래스 변수 -> 클래스 전체에세 인지돠묘ㅡ 특정 매소드 내에서도 인지됨 
	public static void main(String[] args) {
		int a =20; //지역 변스 -> 특정 메소드(함수) 내에서 선언되어 활용되는 변수로써 함수 블록을 벗어나면
		System.out.println("지역변수 a="+a);
		System.out.println("클래스 변수 b="+b);
		run();
		run(30);
	}
	public static void run() {
		int c = 40; //지역 변수
		System.out.println("클래스 변수 b="+b);
	}
	public static void run(int c) { //매게 변수: 메소드(함수) 정의시 괄호 안에 있는 변수로 호출시 지정된 값을 저장한다
												//local scope
		System.out.println("클래스 변수 b="+b);
	}
	
}
