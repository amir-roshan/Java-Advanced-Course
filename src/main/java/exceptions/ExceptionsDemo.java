package exceptions;

import java.io.IOException;

public class ExceptionsDemo
{
	public static void show() throws IOException
	{
		final Account account = new Account();
		try
		{
			account.deposit(1001);
		}
		catch(IOException e)
		{
			System.out.println("Logging");
			throw e;
		}
	}
}
