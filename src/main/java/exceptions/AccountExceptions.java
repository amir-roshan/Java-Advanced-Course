package exceptions;

// chaining an exception means wrapping an exception in another exception
// it is useful when you want to hide the implementation details of the exception

// We have init cause and get cause
public class AccountExceptions extends Exception
{
	public AccountExceptions(Exception cause)
	{
		super(cause);
	}
}
