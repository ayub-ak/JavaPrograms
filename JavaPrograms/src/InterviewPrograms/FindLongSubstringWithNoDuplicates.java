package InterviewPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindLongSubstringWithNoDuplicates {

	public static void main(String[] args) 
	{
		String input = "This is to find long substring with no duplicatess";
		input.trim().toLowerCase();
		Set<String> substrings = new HashSet<String>();
		String[] spiltString;
		spiltString = input.split(" ");
		for(String s : spiltString)
		{
			System.out.println(s);
		}
	}
	
	void checkDuplicates(String s)
	{
		
	}

}
