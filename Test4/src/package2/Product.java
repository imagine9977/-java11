package package2;

public class Product {
	private String pname;
	private int price;
	private int pcode;
	private int size;
	private int amount;
	private String remark;
	//CPU에 load, cpu가 메모리(RAM)에 스토어
	//인터넷 버퍼링
	//메모리가 디스크에 세이브, 디스크는 메모리에 로드, 메모리는 그걸 출력
	//메소드 오버로딩 overload ->매개변수에 따라 여러개 표현하는 것-> overload 인 이유는 같은 메모리에 써넣어서
	public void print() {
		System.out.println("제품정보");
	}
	public void print(String pname) {
		System.out.println("제품이름: "+pname);
	}
	public void print(int amount) {
		System.out.println("제품수량: "+amount);
	}
	
	public void print(String pname, int amount) {
		System.out.println("제품이름: "+pname);
		System.out.println("제품수량: "+amount);
	}
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
