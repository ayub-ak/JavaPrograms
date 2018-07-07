package InterviewPrograms;

import java.util.Scanner;

public class PrintLettersInCircle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str =sc.nextLine();
		String values[] = str.split(" ");
		System.out.println("Enter the starting position");
		int start=sc.nextInt();
		if(start>=0 && start<values.length)
		{
			for(int i=start;i<values.length;i++)
			{
				System.out.println("String at "+i+" position "+values[i]);
			}
			if(start!=0)
			{
				for(int i=0;i<start;i++)
				{
					System.out.println("String at "+i+" position "+values[i]);
				}
			}
		}
	}
}
