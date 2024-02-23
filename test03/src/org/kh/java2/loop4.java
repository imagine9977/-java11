package org.kh.java2;

import java.util.Scanner;

public class loop4 {
	public static void main(String[] args) {
		int i = 0, tot =0;
		while(i <=4) {
			i++;
			tot+=i;
		}
		System.out.println("결과: "+tot);
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력[2-9]: "); 
		int n = sc.nextInt();
		i =0 ;
		while(i<10) {
			i++;
			System.out.print(n+" * "+i+" = "+n*i+"\n");
			
		}
		sc.close();
	}
}
