package MyPracticeProgs;

import java.util.Scanner;

public class FibSeries {

	public static void main(String[] args) 
	{
		int first=0,second=1,sum=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n=Integer.parseInt(input.nextLine());
		if(n>2)
			System.out.println(first+" "+second);
		for(int i=3;i<=n;i++)
		{
			sum=first+second;
			first=second;
			second=sum;
			System.out.println(sum);
		}
	}

}
