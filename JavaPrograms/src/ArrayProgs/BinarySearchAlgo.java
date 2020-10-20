package ArrayProgs;

public class BinarySearchAlgo {

	public static void main(String[] args) 
	{
		int arr[] = {2, 7, 9, 3, 6};
		int length = arr.length;
		int key = 7;
		System.out.println("Is number present : "+isNumberPresent(arr, length, key, 0, length ));
	}
	
	public static boolean isNumberPresent(int arr[],int length, int key,int start, int end)
	{
		int mid=end/2;
		if(key==arr[mid])
			return true;
		if(key>arr[mid])
		{
			
			isNumberPresent(arr, length, key,mid+1,length);
		}
		else if(key<arr[mid])
		{
			isNumberPresent(arr, length, key,0,mid-1);
		}
		return false;
	}

}
