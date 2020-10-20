package InterviewPrograms;

import java.util.ArrayList;

public class CountDigitsFromInteger 
{
	
	public static void main(String[] args) 
	{
		int value = 334467373;
		System.out.println("Sum : "+calcSum(value));
	}
	
	static int calcSum(int n)
	{
		int sum=0;
		while(n>0)
		{
			sum+=n%10;
			n/=10;
		}
		return sum;
	}

}

