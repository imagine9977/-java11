package org.kh.java;

public class variable3 {

	public static void main(String[] args) {
		int bin = 0b10111; //2진수
		int oct = 03647; //8진수
		int dec = 3647; //10진수
		int hex = 0x2c8;
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		System.out.println(Integer.toBinaryString(bin));
		System.out.println(Integer.toOctalString(oct));
		System.out.println(Integer.toHexString(hex));
		System.out.printf("dec 8진수: %o", dec);
		System.out.printf("%ndec 16진수: %x", dec);
		System.out.printf("%ndec => 8진수: %o, 16진수: %x", dec, dec);
	}

}
