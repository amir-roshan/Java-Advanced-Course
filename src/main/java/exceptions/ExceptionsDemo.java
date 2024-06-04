package exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo
{
	public static void show()
	{
		FileReader reader = null;
		try
		{
			var file = new File("file.txt");
			new SimpleDateFormat().parse("abc");
			reader = new FileReader(file);
		}
		// we can have multiple catch exceptions in one catch block
		catch(IOException | ParseException e) // it is called c catch block or catch clause`
		{
			System.out.println("File not found");

			// we can also get the message of the exception
			System.out.println(e.getMessage());
		}
		finally // it always gets executed
		{
			if(reader != null)
			{
				try
				{
					reader.close();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}

		}
	}
}
