package sec3;

public class Account extends Bank {
	public String owner;
	
	public Account(String string,String owner, int i, int j) {
		this.name = string;
		this.owner = owner;
		this.accountNum = i;
		this.money = j;
	}

	@Override
	public void print() {
		System.out.println("은행\t예금주\t계좌번호\t잔액\t");
		System.out.println(name+"\t"+owner+"\t"+accountNum+"\t"+money+"\t");
	}
	
	public String getOwner() {
		return owner;
	}

	@Override
	public String toString() {
		return "Account [owner=" + owner + "]";
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void deposit() {
		// TODO Auto-generated method stub
		
	}
	
}
