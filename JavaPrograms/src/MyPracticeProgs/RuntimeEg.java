package MyPracticeProgs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RuntimeEg {

	public static void main(String[] args) throws IOException 
	{
		//Runtime.getRuntime().exec() method returns object of Process. Use getInputStream()
		//to get the out of exec() method and using BufferReader, we can read the content
		Process process = Runtime.getRuntime().exec("ipconfig");
		BufferedReader bis = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String reader;
		while((reader=bis.readLine())!=null)
		{
			System.out.println("Output of the command : "+reader);
		}
		
	}

}
