package generics;

public class List
{
	private final int[] items;
	private       int   count;

	public List(int size)
	{
		items = new int[size];
	}

	public void add(int item)
	{
		items[count++] = item;
	}

	public int get(int index)
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
