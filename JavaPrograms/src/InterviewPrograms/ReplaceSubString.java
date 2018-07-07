package InterviewPrograms;

public class ReplaceSubString 
{
	public static void main(String[] args) 
	{
		String val="This is my bike. my bike has few features. my bike can give 45 km mileage";
		System.out.println("Original string :"+val);
		StringBuffer modifiedtxt= new StringBuffer();
		String [] txt =val.split("bike");
		int len = txt.length;
		for(int i=0;i<len;i++)
		{
			System.out.println("Text : "+txt[i]);
		}
		for(int i=0;i<len;i++)
		{
			modifiedtxt.append(txt[i]);
			if(i!=len-1)
				modifiedtxt.append("car");
		}
		System.out.println("New String : "+modifiedtxt);
	}

}
