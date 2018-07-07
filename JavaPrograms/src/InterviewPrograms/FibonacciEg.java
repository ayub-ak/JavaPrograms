package InterviewPrograms;

public class FibonacciEg 
{
	public static void main(String[] args) 
	{
		int n=10,first=0,second=1,sum=0;
		if(n>2)
		{
			System.out.println(first+" "+second);
			n--;
		}
		for(int i=2;i<=n;i++)
		{
			sum=first+second;
			first=second;
			second=sum;
			System.out.println(" "+sum);
		}
	}
}
