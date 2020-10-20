package InterviewPrograms;

import java.util.Arrays;

public class IntToASCII {

	public static void main(String[] args) 
	{
		//Converting letter 'b' to integer without casting 
		//(since casting is done implicitly)
		int n = 'b';
		System.out.println("Printing ASCII value of 'b' : "+n);
		
		//Converting charter to byte type and ASCII value will be printed when 
		byte b = 'a';
		System.out.println("Printing ASCII value of 'a' : "+b);
		
		//Printing ASCII values of a string
		String text = "ABCDEFGHIJKLMNOP";
		
		// translating text String to 7 bit ASCII encoding
		byte [] by = text.getBytes();
		for(int i :  by)
		{
			System.out.println(i);
		}
		
		System.out.println(Arrays.toString(by));
		
		
	}

}
