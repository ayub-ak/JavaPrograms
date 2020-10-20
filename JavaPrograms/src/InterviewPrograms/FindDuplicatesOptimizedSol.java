package InterviewPrograms;

import java.nio.channels.WritableByteChannel;

public class FindDuplicatesOptimizedSol {

	public static void main(String[] args) 
	{
		boolean[] ascii = new boolean[256];
		/*//To check default value for boolean array
		for(boolean a : ascii)
			System.out.println("value : "+a);*/
		String input = "dfkljglsdfjfgowejlwkjosdjfklsd";
		int ASCIIPos =0;
		char[] c = input.toCharArray();
		try
		{
			if(input!=null && input.length()>2)
			{
				for (int i=0;i<input.length();i++)
				{
					ASCIIPos = c[i];
					if(ascii[ASCIIPos]==false)
						ascii[ASCIIPos]=true;
					else if (ascii[ASCIIPos]==true)
						c[i]=0; 
				}
			}
			System.out.println("Printing non duplicate values : "+writeNonDuplicateValues(c));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static String writeNonDuplicateValues(char c[])
	{
		StringBuffer sb = new StringBuffer();
		for(char ch : c)
		{
			if(ch!='\0')
				sb.append(ch);
		}
		return sb.toString();
	}

}
