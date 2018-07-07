//Write Code To Filter Duplicate Elements From An Array And Print As A List

package InterviewPrograms;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicatesFromListElements 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		//Adding elements from 0 to 9
		for(int i=0;i<=9;i++)
		{
			list.add(String.valueOf(i));
		}
		//Adding duplicate values (0 to 5)
		for(int i=0;i<=5;i++)
		{
			list.add(String.valueOf(i));
		}
		//Printing all elements
		for(String s : list)
		{
			System.out.println("Element : "+s);
		}
		
		System.out.println("Non duplicated elements: "+printNonDuplicates(list));
	}
	
	public static Set<String> printNonDuplicates(ArrayList<String> list)
	{
		final Set<String> nodup = new TreeSet<String>();
		final Set<String> temp = new TreeSet<String>();
		
		for(String s : list)
		{
			if(temp.add(s))
			{
				nodup.add(s);
				//System.out.println(s);
			}
		}
		return nodup;
	}

}
