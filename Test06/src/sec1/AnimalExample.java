package sec1;

class Animal{
	private String type;
	private String name;
	private int leg;
	private int wings;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public int getWings() {
		return wings;
	}
	public void setWings(int wings) {
		this.wings = wings;
	}
	public void print() {
		System.out.println(this.toString());
	}
	
}

public class AnimalExample {
	public static void main(String[] args) {
		Animal animal1 = new Animal();
		animal1.setLeg(4);
		animal1.setWings(0);
		animal1.setType("Mammal");
		animal1.setName("Horse");
		animal1.print();
		
		Animal eagle = new Animal();
		eagle.setLeg(2);
		eagle.setWings(2);
		eagle.setType("Bird");
		eagle.setName("Eagle");
		eagle.print();
		
		Animal anaconda = new Animal();
		anaconda.setLeg(0);
		anaconda.setWings(0);
		anaconda.setType("Snake");
		anaconda.setName("Anaconda");
		anaconda.print();
	}
}
