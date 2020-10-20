package InterviewPrograms;

import java.util.HashMap;
import java.util.HashSet;

public class FindDupHashSet {

	public static void main(String[] args) 
	{
		String [] strArr = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
		HashSet<String> hm = new HashSet<String>();
		for(String str : strArr)
		{
			if(!hm.add(str))
				System.out.println("Duplicate : "+str);
		}
	}

}
