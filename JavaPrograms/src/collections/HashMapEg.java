package collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapEg 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "abc");
		map.put(1, "bcd"); //Key is duplicate hence it will replace previous value which has same key
		map.put(2, "cde");
		map.put(3, "def");
		System.out.println("Printing Map Entries : ");
		for(Map.Entry me : map.entrySet())
		{
			System.out.println("Key is : "+me.getKey()+" and Value is : "+me.getValue());
		}
		System.out.println("Getting value of key = 1 : "+map.get(1));
		System.out.println("Check whether map contains key = 3 : "+map.containsKey(3));
		System.out.println("Check whether map contains value = abc : "+map.containsValue("abc"));
		map.remove(1);
		System.out.println("Printing map values after removing : "+map);
		System.out.println("Check whether map is empty : "+map.isEmpty());
		System.out.println("Size of the map : "+map.size());
	}

}
