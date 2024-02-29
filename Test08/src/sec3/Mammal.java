package sec3;

//Animals(super, 부모 클래스), , Mammal()subclass, 자식 클래스
//추상화: 모든게 아울려져서 범용적으로 쓰기 편함//쓰는 사람이 상세하게 정리해야 추상화할 수 있음
public class Mammal extends Animal{
	protected int leg;

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
