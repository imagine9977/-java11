package baek;
import java.util.Scanner;

public class snail_2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int up = sc.nextInt();
		int down = sc.nextInt();
		int height = sc.nextInt();
		int day =1;
		int totalD = 0;
		while(totalD<height) {
			totalD+=up;
			if(totalD>=height)break;
			totalD-=down;
			day++;
		}
		System.out.println(day);
		sc.close();
	}
}
