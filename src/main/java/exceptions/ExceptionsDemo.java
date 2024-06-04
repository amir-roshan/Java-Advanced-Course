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
		File file = new File("file.txt");

		// try-with-resources is a feature of Java 7 that automatically closes resources
		try (FileReader reader = new FileReader(file))
		{

			new SimpleDateFormat().parse("abc");

		}
		// we can have multiple catch exceptions in one catch block
		catch(IOException | ParseException e) // it is called c catch block or catch clause`
		{
			System.out.println("File not found");

			// we can also get the message of the exception
			System.out.println(e.getMessage());
		}
	}
}
