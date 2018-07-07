package staticSamples;

public class Test extends Base
{
	//Config config = new Config();
	public void testMethod()
	{
		config.getURL();
	}
	public static void main(String[] args) 
	{
		Base b = new Base();
		b.call();
		Test t = new Test();
		t.testMethod();
	}
}
