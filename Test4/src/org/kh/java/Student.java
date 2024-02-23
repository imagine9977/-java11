package org.kh.java;

public class Student {
	String name;
	int testEng;
	int testKor;
	int testMat;
	int total() {
		return this.testEng+this.testKor+this.testMat; //외부에서 받는 동명의 변수가 없으니 this. 생략
	}
	float avg() {
		return this.total()/3f;
	}
	void resulting() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",
				this.name,this.testEng,this.testKor, this.testMat,this.total(),this.avg());
	}
}
