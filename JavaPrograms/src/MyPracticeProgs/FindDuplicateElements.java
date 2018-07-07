package MyPracticeProgs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElements {

	//Write Code To Filter Duplicate Elements From An Array And Print As A List
	
	public static void main(String[] args) 
	{
		List<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<5;i++)
		{
			al.add(i);
		}
		for(int i=2;i<5;i++)
		{
			al.add(i);
		}
		System.out.println("Printing all elements");
		for(int j : al)
		{
			System.out.println(j);
		}
		Set<Integer> s = new HashSet<Integer>();
		List<Integer> dup = new ArrayList<Integer>();
		for(int j : al)
		{
			if(s.add(j))
			{
				System.out.println(j+" Non duplicate element");
			}
			else
			{
				dup.add(j);
			}
		}
		System.out.println("Printing duplicate values : ");
		for(int j : dup)
		{
			System.out.println(j);
		}
	}

}
