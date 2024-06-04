package exceptions;

// we can throw an exception manually
// we use exceptions to handle errors in our code

// In java, we have 3 types of exceptions:
// 1. Checked exceptions: are checked at compile time, the compiler forces you to handle them
// It is called checked because the compiler checks if you handle them
// We should anticipate and handle checked exceptions

// 2. Unchecked exceptions: are not checked at compile time, the compiler does not force you to handle them
// We got NullPointerException, IllegalArgumentException, IndexOutOfBoundsException, ArithmeticException, etc.

// 3. Errors: are serious problems that should not be caught, they are not meant to be handled

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo
{
	// We make it static so there is no need to create an instance of this class to call this method
	public static void show() throws FileNotFoundException
	{
		var file = new File("file.txt");

		// Compiler forces us to handle the file not found exception
		var reader = new FileReader(file);
	}
}
