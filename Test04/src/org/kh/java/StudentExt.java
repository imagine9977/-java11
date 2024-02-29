package org.kh.java;

public class StudentExt {
	public static void main(String[] args) {
		Student kim = new Student();
		kim.name ="Bob";
		kim.testEng=75;
		kim.testKor=85;
		kim.testMat=100;
		kim.resulting();
		
		Student lee = new Student();
		lee.name ="Lee";
		lee.testEng=85;
		lee.testKor=94;
		lee.testMat=100;
		lee.resulting();
	}
}
