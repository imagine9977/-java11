package org.kh.java;

public class Operation6 {
	public static void main(String[] args) {
		//and 논리
		int a =1, b=2, c=3;
		System.out.println("a>b && a>c : "+(a>b&&b>c));
		System.out.println("a<b && a<c : "+(a<b&&b<c));
		//or
		System.out.println("a>b || a>c : "+(a>b||b>c));
		System.out.println("a<b || a<c : "+(a<b||b<c));
		//not
		System.out.println("!(a>b) : "+!(a>b) );
		System.out.println("!(a<b) : "+!(a<b) );
	}
}
