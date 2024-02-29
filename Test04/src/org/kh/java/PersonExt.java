package org.kh.java;

public class PersonExt {
	public static void main(String[] args) {
		Person Bob = new Person();
		Bob.name = "Bob Ross";
		Bob.gender = "Male";
		Bob.year = 1965;
		Bob.job = "painter";
		Bob.running();
	
		Person lee = new Person();
		lee.running(); //null is running
		System.out.println(lee.year); // 0 출력
		
	}
}
