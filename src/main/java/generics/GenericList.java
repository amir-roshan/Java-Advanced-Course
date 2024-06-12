package generics;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T>
{
	private final T[] items = (T[]) new Object[10];
	private       int count;

	public void add(T item)
	{
		items[count++] = item;
	}

	public T get(int index)
	{
		validateGetIndex(index);
		return items[index];
	}

	protected void validateGetIndex(int index)
	{
		if(index < 0 || index >= count)
			throw new IllegalArgumentException("Invalid index");
	}

	public int getCount()
	{
		return count;
	}

	@Override
	public Iterator<T> iterator()
	{
		return null;
	}
}
