package exceptions;

import java.io.IOException;

public class ExceptionsDemo
{
	public static void show() throws IOException
	{
		final Account account = new Account();
		try
		{
			account.deposit(1000);
			account.withdraw(1000);
		}
		catch(AccountExceptions e)
		{
			var cause = e.getCause();
			System.out.println(cause.getMessage());
		}
		catch(IOException e)
		{
			System.out.println("Logging");
			throw e;
		}

	}
}
