package InterviewPrograms;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateNos {

	public static void main(String[] args) 
	{
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> dup = new HashSet<Integer>();
		for(int i=0;i<10;i++)
		{
			set.add(i);
		}
		System.out.println("Adding duplicates and non duplicates");
		for(int i=8;i<=11;i++)
		{
			if(set.add(i)!=true)
				dup.add(i);
		}
		System.out.println("Printing duplicate values : ");
		for(int d: dup)
		{
			System.out.println(d);
		}
	}

}
