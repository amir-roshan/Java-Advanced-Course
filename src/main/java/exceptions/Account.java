package exceptions;

import java.io.IOException;

public class Account
{
	private float balance;

	public void deposit(float value) throws IOException
	{
		// It is called defensive programming
		// Data validation is required to prevent invalid data from being processed like in libraries or frameworks
		// but in business logic, it is not required because the methods must trust the other methods
		if(value <= 0)
			throw new IllegalArgumentException("value cannot be 0 or negative");

		// Checked exceptions must be handled or declared
		if(value > 1000)
			throw new IOException("value cannot be greater than 1000");
	}

	public void withdraw(float value) throws AccountExceptions
	{
		// Unchecked exceptions do not need to be handled or declared
		if(value >= balance)
		{

			//			InsufficientFundsException fundsException   = new InsufficientFundsException();
			//			AccountExceptions          accountException = new AccountExceptions();
			// Init cause is used because the exception is wrapped in another exception
			//			accountException.initCause(fundsException);
			//			throw accountException;

			throw new AccountExceptions(new InsufficientFundsException());
		}
	}
}
