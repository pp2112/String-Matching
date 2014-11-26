package concrete_implementation;

import interfaces.StringMatcherInterface;
import data_structures.ExactHashMap;
import data_structures.PrefixHashMap;

public class StringMatcher implements StringMatcherInterface {

	private ExactHashMap exact_map = new ExactHashMap();
	private PrefixHashMap prefix_map = new PrefixHashMap();

	@Override
	public void add_exact_match(String exact_str, int val) {
		exact_map.put(exact_str, val);
	}

	@Override
	public void add_prefix_match(String prefix_str, int val) {
		prefix_map.put(prefix_str, val);

	}

	@Override
	public int lookup(String input) {
		int exact_val = exact_map.get(input);
		return exact_val == -1 ? prefix_map.get(input) : exact_val;
	}

	@Override
	public boolean delete_exact_match(String exact_str) {
		return exact_map.remove(exact_str);
	}

	@Override
	public boolean delete_prefix_match(String prefix_str) {
		return prefix_map.remove(prefix_str);
	}

}
