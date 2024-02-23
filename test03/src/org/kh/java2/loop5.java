package org.kh.java2;

public class loop5 {
	public static void main(String[] args) {
		int a =0;
		while(a>0) {
			a++;
			System.out.println(a);
		}
		
		do {
			System.out.println("a="+a);
			a++;
		} while(a<10);
		
		a=0;
		do {
			System.out.println("a="+a);
		} while(a>10); //최소 첫번째는 실행됨 
		
		for(;;) {
			//무한루프
			break;
		}
		int tot=0;
		for(int j=0;j<=100;j++) {
			if(j%2==1) continue;
			tot+=j;
		}
		System.out.println(tot);
	}
}
