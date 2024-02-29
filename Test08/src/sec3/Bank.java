package sec3;

import java.util.Scanner;

public class Bank {
	protected String name;
	protected int accountNum;
	protected int money;
	public Bank() {
	}
	public Bank(String name, int accountNum,int money) {
		this.name = name;
		this.accountNum = accountNum;
		this.money = money;
	}
	
	public void deposit() {
		System.out.println("입금 페이지입니다.\n 계좌번호를 입력해주세요: ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int depMoney=0;
		while(num!=this.accountNum) {
			if(num==this.accountNum) {
				depMoney = sc.nextInt();
				money+=depMoney;
				break;
			}
			num =	sc.nextInt();
		}
		sc.close();
	}
	public void withdaw() {
		System.out.println("출금 페이지입니다.\n 계좌번호를 입력해주세요: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int witMoney=0;
		while(num!=0) {
			if(num==this.accountNum) {
				System.out.println("입금 금액을 입력해주세요: ");
				witMoney = sc.nextInt();
				money-=witMoney;
				break;
			}
			num =	sc.nextInt();
		}
		sc.close();
	}
	
	public void print() {
		System.out.println("은행\t계좌번호\t잔액\t");
		System.out.println(name+"\t"+accountNum+"\t"+money+"\t");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int num) {
		this.accountNum = num;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
}
