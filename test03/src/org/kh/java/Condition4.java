package org.kh.java;

import java.util.Scanner;

public class Condition4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력[0~100]: ");
		int point = scan.nextInt();
		String result;
		//다른 방식은 >=90일시 result=A; 후 구간별로 result = result+"+";
		if(point>=97) {
			result ="A++";
		}else if(point>=93) {
			result ="A0";
		}else if(point>=90) {
			result ="A-";
		}else if(point>=87) {
			result ="B++";
		}else if(point>=83) {
			result ="B0";
		}else if(point>=80) {
			result ="B-";
		}else if(point>=77) {
			result ="C++";
		}else if(point>=73) {
			result ="C0";
		}else if(point>=70) {
			result ="C-";
		}else if(point>=67) {
			result ="D++";
		}else if(point>=63) {
			result ="D0";
		}else if(point>=60) {
			result ="D-";
		}else {
			result ="F";
		}
		System.out.printf("당신의 점수는 %d점입니다. \n당신의 학점은 %s입니다\n", point, result);
		switch(result) {
			case "A++":
			 System.out.println("학업우수상");	
			 break;
			case "A0":
				 System.out.println("노력상");	
				 break;
			case "A-":
				 System.out.println("아차상");	
				 break;
			default:
		}
	}
}
