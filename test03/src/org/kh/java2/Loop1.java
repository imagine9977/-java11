package org.kh.java2;


public class Loop1 {
	public static void main(String[] args) {
		//for, while, do~while 배열
		//for(초기식;조건식;증감식);
		int n =0;
		int[] score = {10,20,40,30,50,60,70,80,90,95}; //배열
		String[] names = {"김","잉","양","박","구","수","막","영","류","허"};
		
		int total=0, max =0,  min = 100;
		
		System.out.println("nums: "+ score);
		System.out.println("names: "+ names);
		System.out.println("\n이름\t점수\t학점\t판정");
		for(int i=0;i<10;i++) {
			
			
			total += score[i];
			System.out.print(score[i]+"\t");
			System.out.print(names[i]+"\t");
			if(score[i]>=90) {
				System.out.print("A\t");
			}else if(score[i]>=80) {
				System.out.print("B\t");
			}else if(score[i]>=70) {
				System.out.print("C\t");
			}else if(score[i]>=60) {
				System.out.print("D\t");
			}else {
				System.out.print("F\t");
			}
			if(score[i]>=70) {
				System.out.print("합격\t\n");
			}else {
				System.out.print("불합격\t\n");
			}
			max = (max>score[i])? max : score[i];
			min = (min<score[i])? min : score[i];
		}
		
		System.out.println("전체 총점:"  +total);
		System.out.println("평균 총점:"  +(total/10.0f));
		System.out.println("최대 총점:"  +max);
		System.out.println("최소 총점:"  +min);
		
	}
}
