package sec1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//List 
public class StudentExam3 {
	public static void main(String[] args) {
		List<Student> s = new ArrayList<Student>();
		Scanner scan = new Scanner(System.in);
		for(int i =0; i<5;i++) {
			Student stud = new Student();
			stud.setNum(i+1);
			stud.setLang(scan.nextInt());
			stud.setEng(scan.nextInt());
			stud.setMat(scan.nextInt());
			s.add(stud);
		}
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점");
		for(int i =0; i<5;i++) {
			s.remove(0).print();
		}
	}
}
