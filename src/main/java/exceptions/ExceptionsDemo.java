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
		catch(InsufficientFundsException e)
		{
			throw new RuntimeException(e);
		}
		catch(IOException e)
		{
			System.out.println("Logging");
			throw e;
		}

	}
}
