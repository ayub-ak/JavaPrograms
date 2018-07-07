package collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapEg 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> lmap = new LinkedHashMap<Integer, String>(); 
		lmap.put(34, "First String");
		lmap.put(23, "Second String");
		lmap.put(54, "Thrid String");
		System.out.println("Linked hash map : "+lmap);
		
		//Access linked hash map using for each loop
		for(Map.Entry me : lmap.entrySet())
		{
			System.out.println("Key is "+me.getKey()+" and Value is "+me.getValue());
		}
		System.out.println("Getting value of key = 1 : "+lmap.get(1));
		System.out.println("Check whether map contains key = 3 : "+lmap.containsKey(3));
		System.out.println("Check whether map contains value = abc : "+lmap.containsValue("abc"));
		lmap.remove(1);
		System.out.println("Printing map values after removing : "+lmap);
		System.out.println("Check whether map is empty : "+lmap.isEmpty());
		System.out.println("Size of the map : "+lmap.size());
	}

}
