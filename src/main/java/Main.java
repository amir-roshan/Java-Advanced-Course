import generics.GenericList;
import generics.Instructor;
import generics.User;
import generics.Utils;

import java.util.ArrayList;

public class Main
{
	public static void main(final String[] args)
	{
		var list = new GenericList<String>();

		// For each loop uses the iterator method to iterate over the list.
		// The for each loop is a syntactic sugar for the iterator method.
		// The for each loop and iterator are working because the iterator interface is implemented in the GenericList class.

		list.iterator();

		while (list.iterator().hasNext())
		{
			var current = list.iterator().next();
			System.out.println(current);
		}

		for(var item : list)
		{
			System.out.println(item);
		}
	}
}
