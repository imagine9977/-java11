package sec1;

public class ArrayCopy1 {
	public static void main(String[] args) {
		int[] arr1 = { 80, 70, 65, 90, 85, 95, 60 };
		int[] arr2 = { 5, 4, 3, 5, 3, 6, 8 };
		int[] arr3;

		arr2 = arr1;
		arr3 = arr1;
		// shallow copy
		
		System.out.println(arr2);
		for(int i =0;i<arr2.length;i++) {
			System.out.println(i+": "+arr2[i]);
		}
		
		arr1[2] = 70;
		for(int i =0;i<arr2.length;i++) {
			System.out.println(i+": "+arr2[i]);
		}
	}
}
