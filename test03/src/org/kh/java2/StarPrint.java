package org.kh.java2;

public class StarPrint {
	public static void main(String[] args) {
		/*
		   *****
		   *****
		   *****
		   *****
		 */
		for(int i = 0; i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		System.out.println();
		/*
		   *
		   **
		   ***
		   ****
		   *****
		   ******
		 */
		for(int i = 0; i<6;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		System.out.println();	
		for(int i = 5; i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
	}
}
