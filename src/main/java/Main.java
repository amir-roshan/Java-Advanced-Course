import generics.GenericList;

public class Main
{
	public static void main(final String[] args)
	{
		// WIth the help of generics we can see the errors at compile time
		GenericList<Integer> list = new GenericList<Integer>();
		list.add(2);

		int number = list.get(0);
		System.out.println(number);
	}
}
