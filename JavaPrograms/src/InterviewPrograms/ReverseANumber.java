//To reverse a number 
package InterviewPrograms;

public class ReverseANumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Test");
		int number =735656;
		int reverse=0,reminder=0;
		while(number>0)
		{
			reminder=number%10;
			number=number/10;
			reverse=(reverse*10)+reminder;
		}
		System.out.println("Number : "+reverse);
	}
}


