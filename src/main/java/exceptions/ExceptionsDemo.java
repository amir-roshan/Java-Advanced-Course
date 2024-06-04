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
		final Account account = new Account();
		try
		{
			account.deposit(-1);
		}
		catch(IOException e)
		{
			throw new RuntimeException(e);
		}
	}
}
