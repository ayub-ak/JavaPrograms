package stringexamples;

public class StrRevNoRevFn 
{
	public static void main(String[] args) 
	{
		String str ="Java programming";
		char ch[] = new char[str.length()];
		int len = str.length()-1;
		int i=0;
		try
		{
		while(len>=0)
		{
			ch[i]=str.charAt(len);
			System.out.println("Value : "+ch[i]);
			i++;
			len--;
		}
		}catch(Exception e)
		{
			System.out.println("Exception : "+e);
		}
		//Another way of printing values using for each loop
		for(char c : ch){
		System.out.println("Value : "+c);
		}
	}

}
