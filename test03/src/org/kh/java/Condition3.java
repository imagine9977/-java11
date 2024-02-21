package org.kh.java;
import java.util.Scanner;

public class Condition3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int point = scanner.nextInt();
		System.out.printf("\n당신의 점수는 %d점입니다.",point);
		if(point>80) {
			System.out.println("A");
		}else if(point>70) {
			System.out.println("B");
		}else {
			System.out.println("F");
		}
		scanner.close();
	}
}
