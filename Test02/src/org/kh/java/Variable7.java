package org.kh.java;

public class Variable7 {
	public static void main(String[] args) {
		String name ="Bob";
		Integer age = 30;
		String age2="30";
		int age3 = Integer.parseInt(age2)+8;
		Float height = 173.65f;
		String height2 = "173.6";
		float height3= Float.parseFloat(height2);
		Double weight = 72.3;
		System.out.println(age3);
		System.out.println("name: "+name.getClass().getName());
		System.out.println(height3);
		//primitive type => wrapper type = boxing
		//wrapper type =>primitive type = unboxing
	}
}
