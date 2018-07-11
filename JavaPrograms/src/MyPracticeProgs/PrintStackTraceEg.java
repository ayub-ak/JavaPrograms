package MyPracticeProgs;

public class PrintStackTraceEg {

	public static void main(String[] args) 
	{
		PrintStackTraceEg obj = new PrintStackTraceEg();
		System.out.println("Printing stack trace when exception is caught");
		obj.PrintStackTrackFn();
		System.out.println("Printing message of exeception");
		obj.getMessageOfException();
	}
	
	public void PrintStackTrackFn()
	{
		try
		{
			int i=10/0;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void getMessageOfException()
	{
		try
		{
			int i=10/0;
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
