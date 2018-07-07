package stringexamples;

public class StringBufferEg 
{
	public static void main(String[] args) 
	{
		String str ="sample text";
		StringBuffer stbr = new StringBuffer("String butter value : ");
		System.out.println(str);
		System.out.println(stbr);
		int i=0;
		int len = str.length();
		while(i<len)
		{
			char c = str.charAt(i);
			stbr.append(c);
			i++;
		}
		System.out.println(stbr);
	}

}
