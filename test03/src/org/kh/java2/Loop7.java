package org.kh.java2;

import java.util.Random;

public class Loop7 {
	public static void main(String[] args) {
		int min =1, max =45;
		Random rand = new Random();
		int i =0;
		int x[] = new int[6];
		while(i<6) {
			int val = rand.nextInt(max + min)+min;
			System.out.print(val+"\t");
			x[i]=val; 
			i++;
		}
		
		
	}
}
