package exceptions;

// Sometimes we see a long list of stack trace because of method calls
// Sometimes the order of the catch clauses matters

// IOException is the parent class of FileNotFoundException
// So we can catch IOException instead of FileNotFoundException

// The order matters depending on the hierarchy of the exceptions

import java.io.File;
import java.io.FileNotFoundException;
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
			reader.close();
		}
		// we can have multiple catch exceptions in one catch block
		catch(IOException | ParseException e) // it is called c catch block or catch clause`
		{
			System.out.println("File not found");

			// we can also get the message of the exception
			System.out.println(e.getMessage());
		}
		//		catch(FileNotFoundException e)
		//		{
		//			e.printStackTrace();
		//		}
	}
}
