package testing.n1ex2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashMap;
import java.util.Set;

import main.n1ex2.CalculoDni;

public class CalculoDniTest {
	
	static HashMap<Integer, Character> testList = new HashMap<Integer, Character>();
	
	private static void addTestValues() {
		testList.put(14391834,'K');
		testList.put(83414533,'L');
		testList.put(23495404,'F');
		testList.put(23458345,'R');
		testList.put(34513453,'K');
		testList.put(74359240,'X');
		testList.put(29834347,'N');
		testList.put(43204909,'F');
		testList.put(27435298,'R');
		testList.put(14560934,'W');
	}
	static {
		addTestValues();
	}
	
	static Set<Integer> methodSourceArgs() {
		return testList.keySet();
	}
	
	@ParameterizedTest
	@MethodSource ("methodSourceArgs")
	@DisplayName ("Els valors generats són els esperats")
	void parameterizedTest(Integer num) {
			assertEquals(CalculoDni.calculateLetter(num), testList.get(num), "la lletra no coincideix");
	}
}
