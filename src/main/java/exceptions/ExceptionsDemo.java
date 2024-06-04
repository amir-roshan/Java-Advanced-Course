package exceptions;

// we can throw an exception manually
// we use exceptions to handle errors in our code
public class ExceptionsDemo
{
	// We make it static so there is no need to create an instance of this class to call this method
	public static void show()
	{
		// Null pointer exception, is the root of many problems in Java
		// the stack trace is very important to know where the error is,
		// it shows the method calls that were made before the exception was thrown in reverse order
		sayHello("null");
	}

	public static void sayHello(final String name)
	{

		System.out.println("Hello " + name.toUpperCase());
	}
}
