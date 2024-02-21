package org.kh.java;


//명령(연산) =>Operation(Opcode+Operand): 0주소 방식 ~3주소 방식
public class Operation1 {
	public static void main(String[] args) {
		boolean b1 =true;
		boolean b2 = !b1; //단항 연산 Unary
		System.out.println(b1);
		System.out.println(b2);
		int i1 =20, i2= 40;
		int i3 = i1+i2;  //이항 연산 Binary
		System.out.println(i3);
		int max = (i1>i2) ? i1:i2; //연산자는 >이거 하나, 삼항 연산 Threeflow
		System.out.println(max);
	}
}
