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

	public void withdraw(float value) throws InsufficientFundsException
	{
		// Unchecked exceptions do not need to be handled or declared
		if(value >= balance)
			// it does not make sense to wrap the exception in try-catch because it can be wrapped
			// in a try-catch block in the main method or other methods that call this method
			throw new InsufficientFundsException();
	}
}
