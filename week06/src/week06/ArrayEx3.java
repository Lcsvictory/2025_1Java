package week06;

import java.util.Arrays;

public class ArrayEx3 {
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = new int[7];
		int arr3[] = new int[10];
		int arr4[] = new int[10];
		
		
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
//			arr1[i] = 9;
			System.out.print(arr2[i]);
			System.out.print(" ");
		}
		
		System.out.println();
		
		
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]);
			System.out.print(" ");
		}
		
		System.out.println();
		
		arr4 = Arrays.copyOf(arr1, arr1.length);
		for (int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i]);
			System.out.print(" ");
		}
 	}
}
