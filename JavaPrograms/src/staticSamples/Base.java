package staticSamples;

public class Base 
{
	public static Config config = new Config();
	public void call()
	{
		//config.getClass();
		System.out.println("Method from Base class is called");
	}
/*	public static void main(String[] args) 
	{
		Base b = new Base();
		b.call();
	}*/

}
