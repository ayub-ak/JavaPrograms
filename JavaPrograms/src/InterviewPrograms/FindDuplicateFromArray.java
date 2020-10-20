package InterviewPrograms;

public class FindDuplicateFromArray 
{
	public static void main(String[] args) 
    {
        String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
        System.out.println("Duplicate Strings : ");
        
        for(int i=0;i<strArray.length-1;i++)
        {
        	for(int j=i+1;j<strArray.length-1;j++)
        	{
        		if(strArray[i]==strArray[j] && i!=j)
        		{
        			System.out.println(strArray[j]);
        		}
        	}
        }
    }    

}
