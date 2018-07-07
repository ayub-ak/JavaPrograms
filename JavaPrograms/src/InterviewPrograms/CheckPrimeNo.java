package InterviewPrograms;

import java.util.Scanner;

public class CheckPrimeNo {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int input = scanner.nextInt();
		if(checkPrimeNumber(input))
			System.out.println("Number : "+input+" is a prime number");
		else
			System.out.println("Number : "+input+" is not a prime number");
	}
	
//Logic is to check if the number(n) is divisible by any one of the numbers (from 2,3,...square root of (n))
//then its a prime number else not a prime number
	public static boolean checkPrimeNumber(int n)
	{
		if(n<1)
			return false;
		else
		{
			for(int i=2;i<Math.sqrt(n);i++)
			{
				if(n%i==0)
					return false;
			}
		}
		return true;
	}
}
