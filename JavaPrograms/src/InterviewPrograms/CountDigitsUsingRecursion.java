package InterviewPrograms;

public class CountDigitsUsingRecursion {

	public static void main(String[] args) 
	{
		int value = 334467373;
		System.out.println("Sum calculation using recursion : "+calcSum(value));
	}

	private static int calcSum(int value) 
	{
		if(value!=0)
		{
			return value%10 + calcSum(value/=10);
		}
		else
			return 0;
	}

}
