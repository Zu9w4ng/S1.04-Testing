package testing.n2ex1;

import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.hamcrest.CoreMatchers.*;



import main.n2ex1.StringToCompare;

public class TestClass {
	
	String string = StringToCompare.getSTRING();
	int num = 8;
	
	@DisplayName ("el string té la longitud indicada")
	@Test
	public void testSameLength() {
		assertThat(string, length(is(num)));
	}
	
	public static Matcher<String> length(Matcher<? super Integer> matcher) {
	    return new FeatureMatcher<String, Integer>(matcher, "a String of length that", "length") {
	        @Override
	        protected Integer featureValueOf(String actual) {
	            return actual.length();
	        }
	    };
	}

}
