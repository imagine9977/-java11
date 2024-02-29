package sec1;

public class ArrayCopy2 {
	public static void main(String[] args) {
		int[] arr1 = { 80, 70, 65, 90, 85, 95, 60 };
		int[] arr2 = { 5, 4, 3, 5, 3, 6, 8 };
		int[] arr3= { 5, 4, 3, 5, 3, 6, 8 };
		System.out.println("arr1: "+arr1);
		System.out.println("arr2: "+arr2);
		System.out.println("arr3: "+arr3);  //주소는 2와 다르다
		arr2=arr1; //shallow cpy
		for(int i =0;i<arr1.length;i++) { //deep copy
			arr3[i]=arr1[i];
			System.out.println(i+": "+arr1[i]);
		}
	}
}
