package InterviewPrograms;

public class ExtractNoAndAdd {

	public static void main(String[] args) 
	{
		char c; int sum = 0;
		String txt ="abdk22kdk43d";
		for(int i=0;i<txt.length();i++)
		{
			c = txt.charAt(i);
			if(Character.isDigit(c));
				sum=sum+Character.getNumericValue(c);
		}
		System.out.println("Sum : "+sum);
	}

}
