import generics.GenericList;
import generics.Instructor;
import generics.User;
import generics.Utils;

import java.util.ArrayList;

public class Main
{
	public static void main(final String[] args)
	{
		final ArrayList<User> users = new ArrayList<>();

		final User user1 = new Instructor(10);
		final User user2 = new User(20);
		final User user3 = new Instructor(30);

		users.add(user1);
		users.add(user2);
		users.add(user3);

		Utils.print(user1);
		System.out.println("-----------------");
		Utils.print(users);

		// OR
		System.out.println("-----------------");

		var instructors = new GenericList<Instructor>();
		var usersList   = new GenericList<User>();

		instructors.add(new Instructor(10));
		usersList.add(new User(20));

		Utils.print(instructors);
		Utils.print(usersList);
	}
}
