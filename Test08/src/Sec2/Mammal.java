package Sec2;

//Animals(super, 부모 클래스), , Mammal()subclass, 자식 클래스
public class Mammal extends Animal{
	 int leg;

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	@Override
	public String toString() {
		return "mammal leg=" + leg +", name=" + name + ", spine=" + spine;
	}
	
	@Override
	public String print() {
		return "Mammal leg=["+leg+"], name =["+super.name+"]";
	}
	
}
