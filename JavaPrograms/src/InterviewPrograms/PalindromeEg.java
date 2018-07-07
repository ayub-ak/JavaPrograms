package InterviewPrograms;

public class PalindromeEg 
{
	public static void main(String[] args) 
	{
		//To find palindrome with reverse function
		String val ="maddam";
		boolean result = true;
		for(int i=val.length()-1,j=0;i>=0;i--,j++)
		{
			if(val.charAt(i)==val.charAt(j))
				continue;
			else
				result=false;
		}
		if(result==true)
			System.out.println("String is a Palindrome");
		else
			System.out.println("String is not a Palindrome");
	}

}
