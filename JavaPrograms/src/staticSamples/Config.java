package staticSamples;

public class Config //extends Base
{
	String url;
	public Config()
	{
		url="test";
	}
	
	public String getText()
	{
		System.out.println("Calling getText from Config class");
		return "Sample";
	}
	public String getURL()
	{
		System.out.println("Calling getURL from Config class");
		return url;
	}
	
/*	public static void main(String[] args) 
	{
		
	}*/

}
