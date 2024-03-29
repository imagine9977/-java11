package org.kh.java;

public class Operation7 {
	//+=, -=, *=,/=,%=,%=,&=,|=,>>=,<<=,>>>=,^=
	//비트연산자
	//&(and),|(or),~(complement),^(xor), >>(right shift), <<(Left shift), >>>(triple right shift)
	public static void main(String[] args) {
		int a =20;
		int b= 15;
		int c;
		a+=b;
		b-=a;
		c=a;
		a=b;
		b=c;
		System.out.println(a+" "+b+" "+c);
		int x =0b01101; //13
		int y =0b01011; //11
		int z =16;
		int w = -5;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		System.out.printf("%d \n", x);
		System.out.println(Integer.toBinaryString(x&y)); //2진수 xy 각자 자리수 비교해서 & 적용
		System.out.println(Integer.toBinaryString(x|y));//2진수 xy 각자 자리수 비교해서 | 적용
		System.out.println(Integer.toBinaryString(~x)); //complement(not), 32bit 자리 전부 바꿔서 길어짐
		System.out.println(Integer.toBinaryString(x^y)); //xor 
		System.out.println(~x);
		System.out.println(~y);
		System.out.println(x>>2); //1101 -> 11  (사실상 /4)
		System.out.println(x<<2); //1101 -> 110100 (사실상 *4)
		System.out.println(z>>2); //10000 -> 100
		System.out.println("w : "+Integer.toBinaryString(w)); 
		System.out.println("w>>2 : "+Integer.toBinaryString(w>>2)); 
		System.out.println(w>>2);
		System.out.println("w>>>2 : "+Integer.toBinaryString(w>>>2));  //빈자리 0으로 채워줘서 음수를 나타내는 1이 0으로 바뀜
		System.out.println(w>>>2); 
		System.out.println("w>>29 : "+Integer.toBinaryString(w>>29)); 
		System.out.println(w>>29); 
		System.out.println("w>>>29 : "+Integer.toBinaryString(w>>>29)); 
		System.out.println(w>>>29); 
		
		int n = 25; //11001
		int m = 30; //11110
		n&=m; //11000
		n=25;
		n|=m; //11111
		n=25;
		n^=m; //00111
		m>>=2; //111
		System.out.println(m); 
		m = 30;
		m<<=2; //1111000
		System.out.println(m); 
		m = 30;
		m>>>=2; //111
		System.out.println(m); 
		
	}

}
