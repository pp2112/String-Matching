package tests;

import org.junit.Test;

import concrete_implementation.StringMatcher;

public class TestPrefixMatch {
	@Test
	public void test() {
		StringMatcher matcher = new StringMatcher();
		matcher.add_prefix_match("img",1);
		assert(matcher.lookup("imgcutepuppy") == 1);
		assert(matcher.lookup("htmlcutepuppy") == -1);
	}

}
