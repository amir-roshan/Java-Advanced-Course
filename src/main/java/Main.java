import generics.GenericList;

// Bytecode platform is an intermediate code between source code and machine code.
// Internally the generics are converted to Object type.
// This is called type erasure, and it acts as non-generic code.
// If we apply a constraint to a generic type, it will be converted to the constraint type rather than the Object type.
// The java compiler will take the last constraint type from the left side to use it as the constraint type.
// This process is called type erasure.
public class Main
{
	public static void main(final String[] args)
	{
		// With the help of generics we can see the errors at compile time
		GenericList<Integer> list = new GenericList<>();
		list.add(2); // this process is called boxing

		int number = list.get(0); // this process is called unboxing
		System.out.println(number);
	}
}
