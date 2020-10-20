package InterviewPrograms;

public class SumOfDigitsUntilSingleNo 
{
	public static void main(String[] args) 
	{
		// Finding sum of digits of a number until sum becomes single digit Using Recursion
		int value = 24343476; 
		while((value=calcSum(value))>9)
		{
			calcSum(value);
		}
		System.out.println("Sum of digits until sum becomes single number : "+value);
		
		//System.out.println("Sum of digits : "+calcSum(value));
	}

	private static int calcSum(int value) 
	{
		
		return (value==0)? 0:value%10 + calcSum(value/10);
		 
	}

}
