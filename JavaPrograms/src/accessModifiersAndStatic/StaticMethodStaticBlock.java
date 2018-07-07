package accessModifiersAndStatic;

public class StaticMethodStaticBlock 
{
	static void staticMethod()
	{
		System.out.println("Calling static method");
	}
	
	void nonStaticMethod()
	{
		staticMethod();
	}
	
	public static void main(String[] args) 
	{
		StaticMethodStaticBlock sm = new StaticMethodStaticBlock();
		sm.staticMethod();
		sm.nonStaticMethod();
		//nonStaticMethod();    //Cant access non static method from static method
	}
	
	static
	{
		System.out.println("Calling static block");
	}
}

