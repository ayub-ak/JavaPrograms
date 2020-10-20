package ArrayProgs;

import java.util.Arrays;

public class BinarySearchInBuildFn {

	public static void main(String[] args) 
	{
		int arr[] = {2, 7, 9, 3, 6};
		int length = arr.length;
		int key = 9;
		System.out.println("Is number present : "+isNumberPresent(arr, length, key));
		System.out.println("Is number present : "+isNumberPresent(arr, length, 10));
	}
	
	public static boolean isNumberPresent(int arr[], int length, int key)
	{
		Arrays.sort(arr);
		int value =Arrays.binarySearch(arr, key);
		return value>0? true:false;
	}

}
