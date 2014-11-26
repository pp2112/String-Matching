package tests;

import org.junit.Test;

import concrete_implementation.StringMatcher;

public class TestExactMatch {

	@Test
	public void test() {
		StringMatcher matcher = new StringMatcher();
		matcher.add_exact_match("contactus",1);
		assert(matcher.lookup("contactus") == 1);
	}

}
