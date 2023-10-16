package main.n1ex3;

public class ExceptionClass extends Exception{

	public static void throwException() throws ArrayIndexOutOfBoundsException {
		throw new ArrayIndexOutOfBoundsException();
	}
}
