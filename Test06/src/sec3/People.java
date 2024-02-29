package sec3;

public class People {
	public static int selNum=100; //공유 데이터
	public String name;
	public int age;
	public String addr;
	
	public void print1() {
		System.out.println("selNum : "+this.selNum);
		System.out.println("Name : "+this.name);
	}
	
	public static void print2() {
		System.out.println("Name : 아무게");
		System.out.println("age: 24");
	}
}
