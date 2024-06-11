package generics;

import java.util.ArrayList;

public class Utils
{

	/**
	 * Returns the maximum of two objects.
	 *
	 * @param <T>    the type of objects being compared; must implement Comparable
	 * @param first  the first object to be compared
	 * @param second the second object to be compared
	 * @return the maximum of the two objects
	 */
	public static <T extends Comparable<T>> T max(T first, T second)
	{
		return (first.compareTo(second) < 0) ? second : first;
	}

	// Generic method , K stands for Key, V stands for Value
	public static <K, V> void print(K key, V value)
	{
		System.out.println("Key: " + key + ", Value: " + value);
	}

	public static void print(User user)
	{
		System.out.println(user);
	}

	public static void print(ArrayList<User> users)
	{
		for(User user : users)
		{
			System.out.println(user);
		}
	}

	// The ? mark is a wildcard character which means any type that extends User
	// instead of extending User we can use super User, super User means any type that is a parent of User
	// We can not store the value in a variable of type user because we don't know the type of the object when
	// we use the super keyword
	public static void print(GenericList<? extends User> users)
	{
		User user = users.get(0);
		System.out.println(users.getCount());
	}

}
