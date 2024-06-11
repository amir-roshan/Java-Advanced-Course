package generics;

// Multiple type parameters can be defined in a single class
public class KeyValuePair<K, V>
{
	private final K key;
	private final V value;

	public KeyValuePair(K key, V value)
	{
		this.key   = key;
		this.value = value;
	}

	public K getKey()
	{
		return key;
	}

	public V getValue()
	{
		return value;
	}
}
