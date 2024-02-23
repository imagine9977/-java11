package org.kh.java2;

public class loop2 {
	public static void main(String[] args) {
		int[] score= {9,12,3,7,6,8,10,11};
		int max =0, min=100;
		for(int i=0;i<8;i++) {

			max = (max>score[i])? max : score[i];
			min = (min<score[i])? min : score[i];
		}
	}
}
