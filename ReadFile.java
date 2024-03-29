package imagToText;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {
	public static String read_a_file(String file_name) 
	{
		BufferedReader br = null; 
		String read_string="";
		try 	//reading the data from the stored buffer
		{
			String sCurrentLine;
			br = new BufferedReader(new FileReader(file_name));
			while ((sCurrentLine = br.readLine()) != null) 
			{
				read_string=read_string+sCurrentLine;
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		} 
		finally 	//closing the file
		{
			try 
			{
				if (br != null)br.close();
			} 
			catch (Exception ex) 
			{
				ex.printStackTrace();
			}
		}
		return read_string;
	}
}
