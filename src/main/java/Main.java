import generics.GenericList;
import generics.User;

public class Main
{
	public static void main(final String[] args)
	{
		final User user1 = new User(10);
		final User user2 = new User(20);

		System.out.println(user1.compareTo(user2));

		if(user1.compareTo(user2) < 0)
		{
			System.out.println("user1 is less than user2");
		}
		else if(user1.compareTo(user2) > 0)
		{
			System.out.println("user1 is greater than user2");
		}
		else
		{
			System.out.println("user1 is equal to user2");
		}
	}
}
