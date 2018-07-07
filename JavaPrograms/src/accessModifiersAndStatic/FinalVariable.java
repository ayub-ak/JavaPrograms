package accessModifiersAndStatic;

public class FinalVariable 
{
	final int value;
	
	public FinalVariable(int a) 
	{
		System.out.println("Initializing blank final variable using constructor");
		value=a;
	}
	
	void modifiyFinalVariable()
	{
		//Cant change value of final variable
		//value++;
		System.out.println("Final Variable's Value : "+value);
	}
	
	public static void main(String[] args) 
	{
		FinalVariable obj = new FinalVariable(100);
		obj.modifiyFinalVariable();
	}

}
