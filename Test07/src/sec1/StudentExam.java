package sec1;

import java.util.Scanner;

public class StudentExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체배열
		Scanner scan = new Scanner(System.in);
		Student s[] = new Student[5];

		for (int i = 0; i < 5; i++) {
			s[i] = new Student();
			s[i].setNum(i+1);
			s[i].setLang(scan.nextInt());
			s[i].setEng(scan.nextInt());
			s[i].setMat(scan.nextInt());
			
			
		}
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점");
		for (int i = 0; i < 5; i++) {
			s[i].print();
		}

	}
}
