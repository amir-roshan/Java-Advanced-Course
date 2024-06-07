package generics;

// T stands for type it is used in generics
// E stands for element it is used in collections
public class GenericList<T>
{
	private T[] items = (T[]) new Object[10];
	private int count;

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
}
