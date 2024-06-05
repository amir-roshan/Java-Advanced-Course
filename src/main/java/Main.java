import exceptions.ExceptionsDemo;

// I've learned about:
// We have 3 types of exceptions: checked, unchecked and errors
// To handle exceptions we use try-catch blocks
// To throw an exception we use the throw keyword
// To create a custom exception we create a class that extends Exception or RuntimeException
// To chain exceptions we use the initCause method
public class Main
{
	public static void main(final String[] args)
	{
		try
		{
			ExceptionsDemo.show();
		}
		catch(Throwable e)
		{
			System.err.println(e.getMessage());
		}
	}
}
