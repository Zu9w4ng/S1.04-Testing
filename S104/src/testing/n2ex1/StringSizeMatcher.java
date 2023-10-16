package testing.n2ex1;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

public class StringSizeMatcher extends FeatureMatcher {

	public StringSizeMatcher(Matcher subMatcher, String featureDescription, String featureName) {
		super(subMatcher, featureDescription, featureName);
	}

	@Override
	protected Object featureValueOf(Object actual) {
		
		return null;
	}

	
}
