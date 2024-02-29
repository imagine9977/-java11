package sec1;

public class Bus {
	int no;
	int cnt;
	int money;

	public void show() {
		System.out.println(no+" "+cnt+ " "+money);
	}

	public Bus(int no) {
		this.no = no;
	}

	public void take(int money) {
		this.money += money;
		cnt++;
	}

	public void ride(int cnt, int money) {
		this.cnt += cnt;
		this.money += money;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}
