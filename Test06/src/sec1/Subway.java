package sec1;

public class Subway {
	int no;
	String station;
	int money;
	int cnt; 
	
	public Subway(int no){
		this.no = no;
	}
	public void take(int money) {
		this.money += money;
		cnt++;
	}
	public void show() {
		System.out.println("지하철"+no+"호선 역: "+station+" 수익: "+money+" 인원 수:"+cnt);
	}
	
	
}
