import exceptions.ExceptionsDemo;

import java.io.IOException;

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
			System.err.println("An unexpected error occurred");
		}
	}
}
