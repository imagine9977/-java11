package org.kh.java;

public class Variable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = true; //논리형
		byte b = 127; // 127은 되고 255가 안되는 이유는 음수도 보관해야되서(-128~127)
		short c = 32763;
		char d = 'k';
		int e = 32312;
		float f = 3.14f;
		long g = 23455555;
		double h =3.14;
		System.out.println("boolean: "+a);
		System.out.println("byte: "+Byte.MIN_VALUE+" ~ "+Byte.MAX_VALUE);
		//Byte 같은 값은 해당 reference
		System.out.println("short: "+Short.MIN_VALUE+" ~ "+Short.MAX_VALUE);
		System.out.println("Char: "+Character.MIN_VALUE+" ~ "+Character.MAX_VALUE);
		System.out.println("Int: "+Integer.MIN_VALUE+" ~ "+Integer.MAX_VALUE);
		System.out.println("Float: "+Float.MIN_VALUE+" ~ "+Float.MAX_VALUE);
		System.out.println("Long: "+Long.MIN_VALUE+" ~ "+Long.MAX_VALUE);
		System.out.println("Double: "+Double.MIN_VALUE+" ~ "+Double.MAX_VALUE);
		long so = 3212321l;
	}

}
