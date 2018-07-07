package accessModifiersAndStatic;

public class StaticVariable 
{
	int variable;
	static int staticvari=500;
	
	StaticVariable(int v)
	{
		variable=v;
	}
		
	public static void main(String[] args) 
	{
		//CANT ACCESS NON-STATIC VARIABLE FROM STATIC METHOD WITHOUT USING 
									//CLASS INSTANCE VARAIBLE (OBJECT) 
		//System.out.println("Accessing normal variable : "+variable);
		
		//ACCESSING NON-STATIC VARIABLE USING CLASS INSTANCE VARAIBLE (OBJECT)
		StaticVariable sv1 = new StaticVariable(10);
		System.out.println("Accessing static variable through class object : "+sv1.variable);
		StaticVariable sv2 = new StaticVariable(20);
		System.out.println("Accessing static variable through class object : "+sv2.variable);
		
		System.out.println("Accessing static variable from static method : "+staticvari);
	}
}
