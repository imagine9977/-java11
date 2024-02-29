package sec3;

import java.util.Scanner;

public class BankExam {
	public static void process(Account[] acc) {
		Scanner sc = new Scanner(System.in);
		int option = 1;
		
		boolean sw = true;
		while (sw) {
			System.out.println("무엇을 하시겠습니까?: ");
			option = sc.nextInt();
			switch (option) {
			case 1:
				acc[0].deposit();
				process(acc);
				break;
			case 2:

				acc[0].withdaw();
				process(acc);
				break;
			case 3:

				acc[0].print();

				process(acc);
				break;
			case 0:
				sw=false;
				break;
			default:
				process(acc);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Account[] acc = new Account[10];
		acc[0] = new Account("국민은행", "홍길동", 0, 100);
		process(acc);
	}
}
