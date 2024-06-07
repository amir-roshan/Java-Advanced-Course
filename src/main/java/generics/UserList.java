package generics;

// without generics, we are going to have lots of casts and code duplication
public class UserList
{
	private final User[] items;
	private       int    count;

	public UserList(int size)
	{
		items = new User[size];
	}

	public void add(User item)
	{
		items[count++] = item;
	}

	public User get(int index)
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
