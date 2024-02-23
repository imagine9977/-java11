package org.kh.java2;

import java.util.Scanner;

public class loop6 {
	public static void main(String[] args) {
		int quiz =(int) (Math.random()*100);
		System.out.println(quiz);
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("Enter a number [0-100]: ");
			int n = s.nextInt();
			if(quiz==n) {
				System.out.println("Congratulations!");
				break;
			}else {
				if(n>quiz) {
					System.out.println("Lower");
				}else {
					System.out.println("Higher");
				}
			}
		}
		s.close();
	}
	
	
}
