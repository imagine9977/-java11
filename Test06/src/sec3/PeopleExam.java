package sec3;

public class PeopleExam {
	public static void main(String[] args) {
		People p1 = new People();
		p1.selNum = 400; //People.selNum = 400과 동일 => 클래스 변수 , 정적 필드
		p1.age =30; // 인스턴스 변수 = 동적 필드
		p1.addr = "가산동";
		p1.name = "Garen";
		
		People p2 = new People();
		p2.selNum = 300;
		p2.age =30;
		p2.addr = "가산동";
		p2.name = "Pike";
		
		System.out.println(p1.selNum+","+p1.name); //원래 400
		System.out.println(p2.selNum+","+p2.name); //300이 되면서 위에도 300
		
		p1.print1();
		p2.print1();
		
		p1.print2(); //People.print2와 동일
		p2.print2();//People.print2와 동일
		//정적static 요소: static으로 선언된 피드 또는 메소드, 객체의 생성없이 활용 가능
		//정적static 메소드: 객체의 생성없이 해당하는 클래스에서 바로 활용하는 메소드
		System.out.println("정적메소드==클래스 메소드");
		People.print2();
		People.selNum = 500;
		p1.print1();
		p2.print1();
	}

}
