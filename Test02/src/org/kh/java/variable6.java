package org.kh.java;

public class variable6 {
	public static void main(String[] args) {
		float f1 = 3.145f;
		double f2 = 3.145;
		int kor =90 ,eng = 80, mat =95;
		float math = 95.0f;
		float avg1 = (kor+eng+mat)/3;
		float avg2 = (kor+eng+mat)/3.0f;
		float avg3 = (float) (kor+eng+mat)/3;
		System.out.printf("\nf1=%.3f",f1); //3.145
		System.out.printf("\nf1=%.2f",f1); //3.14
		System.out.printf("\n평균=%.2f",avg1); // 86.00
		System.out.printf("\n평균=%.2f",avg2); //
		System.out.printf("\n평균=%.2f",avg3); // 86.

	}
}