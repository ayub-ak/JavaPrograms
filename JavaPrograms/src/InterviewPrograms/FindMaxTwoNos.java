package InterviewPrograms;

public class FindMaxTwoNos 
{
	public static void main(String[] args) 
	{
		int maxno1=0, maxno2=0;
		int a[]={1,455,34,555,83,64,8999};
		for(int i:a)
		{
			if(maxno1<i)
			{
				maxno2=maxno1;
				maxno1=i;
			}
		}
		System.out.println("Max no 1 : "+maxno1);
		System.out.println("Max no 2 : "+maxno2);
	}

}
