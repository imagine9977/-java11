package org.kh.java;

public class Condition1 {

	public static void main(String[] args) {
		// 조건문
		int point = 80;
		String pass = "불합격";
		if (point>= 70) pass ="합격";
		System.out.printf("YOur grade is %d, and you have %s \n",point, pass);
	}

}
