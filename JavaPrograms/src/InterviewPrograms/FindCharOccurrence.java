package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class FindCharOccurrence 
{

	public static void main(String[] args) 
	{
		String str="sample text to find occurrence of characters";
		String lowercasestr = str.toLowerCase();
		//Converting String to char array
		char string[] = lowercasestr.toCharArray();
		Map<Character, Integer> map = new HashMap();
		for(Character c : string)
		{
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c, 1);
		}
		
		System.out.println("Printing characters whose occurances are more than 1");
		for(Map.Entry me : map.entrySet())
		{
			int i = (Integer) me.getValue();
			if(i>1)
				System.out.println("Character : "+me.getKey()+" has occurances of "+me.getValue());
		}
	}
}
