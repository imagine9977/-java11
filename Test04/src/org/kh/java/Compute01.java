package org.kh.java;

public class Compute01 {
	void func1(){ //반환x,매개변수x ->제1유형
		System.out.println("Print this 1");
	}
	void func2(int a){ //반환x,매개변수O ->제2유형
		System.out.println("Print this 2 and "+a);
	}
	int func3(){ //반환o,매개변수x ->제3유형
		System.out.println("Print this 3 and ");
		return 5;
	}
	String func4(int b){ //반환o,매개변수o ->제4유형
		System.out.println("Print this 4 and "+b);
		if(b>5) return "No";
		return "Yes";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compute01 c1= new Compute01();
		c1.func1(); //메소드 호출
		c1.func2(3); //메소드 호출
		c1.func3(); //메소드 호출
		System.out.println(c1.func4(4));
		System.out.println(c1.func4(6));
	}

}
