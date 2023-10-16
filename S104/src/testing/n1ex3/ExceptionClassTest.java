package testing.n1ex3;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.n1ex3.ExceptionClass;

public class ExceptionClassTest {

	@DisplayName ("Llença la excepció corresponent")
	@Test
	void exceptionTest() {
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> ExceptionClass.throwException());
	}
}
