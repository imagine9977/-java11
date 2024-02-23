package org.kh.java2;

public class StarPrintQuiz {
	public static void main(String[] args) {
		System.out.println("1. ");
		for(int i = 0; i<4;i++) {
			for(int j=0;j<6;j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
//////////////////////////////////////////
		System.out.println("2. ");
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
//////////////////////////////////////////
		System.out.println("3. ");
		for(int i = 6; i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
//////////////////////////////////////////
		System.out.println("4. ");
		for(int i = 6; i>0;i--) {
			for(int j=i;j<6;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
//////////////////////////////////////////
		System.out.println("5. ");
		for(int i = 1; i<=6;i++) {
			for(int j=i;j<6;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
//////////////////////////////////////////
		System.out.println("6. ");
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
			for(int j=i+1;j<6;j++) {
				System.out.print(" ");
			}
			System.out.println();	
		}
		for(int i = 5; i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
//////////////////////////////////////////
		System.out.println("7. ");
		/*
		   ******
		   *
		   **
		   ***
		   ****
		   *****
		   ******
		 */
		for(int i = 5; i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		for(int i = 0; i<6;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=i+1;j<6;j++) {
				System.out.print(" ");
			}
			System.out.println();	
		}
//////////////////////////////////////////
		System.out.println("8. ");
		for(int i = 1; i<=6;i++) {
			for(int j=i;j<6;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();	
		}	
		for(int i = 5; i>0;i--) {
			for(int j=i;j<=5;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
//////////////////////////////////////////
		System.out.println("9. ");
		for(int i = 1; i<=9;i+=2) {
			for(int j=i;j<9;j+=2) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		
//////////////////////////////////////////
		System.out.println("10. ");
		for(int i = 9; i>=1;i-=2) {
			for(int j=i;j<9;j+=2) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
//////////////////////////////////////////		
		System.out.println("11. ");
		for(int i = 1; i<=9;i+=2) {
			for(int j=i;j<9;j+=2) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		for(int i = 7; i>=1;i-=2) {
			for(int j=i;j<=7;j+=2) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
//////////////////////////////////////////
		System.out.println("12. ");
		for(int i = 1; i<11;i+=2) {
			for(int j=i;j<=9;j+=2) {
				System.out.print("*");
			}
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<11;j+=2) {
				System.out.print("*");
			}
			System.out.println();	
		}
		for(int i = 7; i>=1;i-=2) {
			for(int j=i;j<=9;j+=2) {
				System.out.print("*");
			}
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=9;j+=2) {
				System.out.print("*");
			}
			System.out.println();	
		}
	}
}
