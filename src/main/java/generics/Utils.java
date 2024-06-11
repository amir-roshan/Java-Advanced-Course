package generics;

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

}
