package MyPracticeProgs;

public class ClassAndMethodName {

	public static void main(String[] args) 
	{
		ClassAndMethodName obj = new ClassAndMethodName();
		System.out.println("Getting the currently executing method name : ");
		obj.test1();
		obj.toPrintClassName();
	}
	
	public void test1()
	{
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public void toPrintClassName()
	{
		System.out.println("Getting current class : "+ this.getClass().getSimpleName());
	}

}
