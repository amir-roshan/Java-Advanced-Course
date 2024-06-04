import exceptions.ExceptionsDemo;

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
