package Sec1;

public class AnimalExam {
	public static void main(String[] args) {
		Animal a1= new Animal();
		Animal a2= new Mammal();
		Animal a3= new Birds();
		
		Mammal m1 = new Mammal();
		
		Animal a4; //선언먼저, 객체 선정은 나증에
		a4 = new Animal();
		a4.setName("구렁이");
		a4.setSpine(true);
		System.out.println( a4.print());
		
		a4 = new Mammal(); //매멀로 객체 전환
		a4.setName("Tiger");
		//a4.setLegs(4); //작동 안됨
		System.out.println( a4.print());
		
		a4 = new Birds(); //Bird로 형 변환
		a4.setName("갈매기");
		System.out.println( a4.print());
		//부모 클래스로 부터 상속받은 메소드를 다르게 구현 -> 메소드 오버 라이딩
		//부모 클래스로 선언된 객체는 부모 자신 또는 자식 생성자를 활용하여 다양하게 형변환 할 수 있음=>다형성
		
	}
}
