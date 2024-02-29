package sec1;



public class Student {
	
	private String name;
	private int grade;
	private int money;
	
	public Student() {
		this.name = "아무개";
	}
	
	public Student(String name) {
		this.name = name;
	}
	public Student(String name, int grade) {
		this.name = name;
		this.grade= grade;
	}
	public Student(String name, int grade, int money) {
		this.name = name;
		this.grade= grade;
		this.money = money;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

	public void print() {
		System.out.println("Student [name=" + name + ", grade=" + grade + ", money=" + money + "]"); 
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -=1000;
	}
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -=1500;
	}

}
