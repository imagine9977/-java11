package org.kh.java;

public class Operation4 {
	public static void main(String[] args) {
		int a =10, b=10;
	    //++a: a=a+1
		System.out.println("전위 증가 연산: "+(++a)); //a를 먼저 더하고 출력
		System.out.println("후위 증가 연산: "+(b++)); //b를 먼저 출력하고 더한다
		System.out.println("전위 감소 연산: "+(--a));
		System.out.println("후위 감소 연산: "+(b--));
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}
