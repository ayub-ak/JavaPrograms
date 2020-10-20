package stringexamples;

import java.util.Scanner;

public class StringEg {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str= input.nextLine();
		System.out.println("Input : "+str);
		System.out.println("Output of replace string : "+str.replace('s', 't'));
		System.out.println("Value of string variable before assignment : "+str);
		str=str.replace('s', 't');
		System.out.println("Value of string variable after assignment : "+str);
		System.out.println("String length :"+str.length());
		System.out.println("Sub string : "+str.substring(3, 7));
	}

}
