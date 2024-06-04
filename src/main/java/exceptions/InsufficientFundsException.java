package exceptions;

// Checked -> Exception
// Unchecked -> RuntimeException
public class InsufficientFundsException extends Exception
{
	public InsufficientFundsException()
	{
		super("Insufficient funds in the account");
	}

	public InsufficientFundsException(final String message)
	{
		super(message);
	}
}
