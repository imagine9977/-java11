package baek;

import java.util.Scanner;

public class alarm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		if(m-45<0) {
			m+=15;
			if(h==0) {
				h=23;
			}else {
				h-=1;
			}
		}else {
			m-=45;
		}
		System.out.println(h+" "+m);
	}
}