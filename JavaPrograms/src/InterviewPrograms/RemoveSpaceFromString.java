package InterviewPrograms;

import java.util.StringTokenizer;

public class RemoveSpaceFromString {

	public static void main(String[] args) 
	{
		String str ="This is a sammple string example";
		StringTokenizer st = new StringTokenizer(str);
		StringBuffer sb = new StringBuffer();
		while(st.hasMoreElements())
		{
			System.out.println("String Token : "+ st.nextToken());
			sb.append(st.nextElement());
		}
		
		System.out.println("Output : "+sb);
	}

}
